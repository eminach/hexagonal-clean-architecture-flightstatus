package com.eminach.flightsearch.infrastructure.adapters.config;

import com.eminach.flightsearch.domain.service.FlightStatusService;
import com.eminach.flightsearch.infrastructure.adapters.output.eventpublisher.FlightStatusEventPublisherAdapter;
import com.eminach.flightsearch.infrastructure.adapters.output.persistence.FlightStatusPersistenceAdapter;
import com.eminach.flightsearch.infrastructure.adapters.output.persistence.mapper.FlightStatusPersistenceMapper;
import com.eminach.flightsearch.infrastructure.adapters.output.persistence.repository.FlightStatusRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public FlightStatusPersistenceAdapter flightStatusPersistenceAdapter(FlightStatusRepository flightStatusRepository, FlightStatusPersistenceMapper flightStatusPersistenceMapper) {
        return new FlightStatusPersistenceAdapter(flightStatusRepository, flightStatusPersistenceMapper);
    }

    @Bean
    public FlightStatusEventPublisherAdapter flightStatusEventPublisherAdapter(ApplicationEventPublisher applicationEventPublisher) {
        return new FlightStatusEventPublisherAdapter(applicationEventPublisher);
    }

    @Bean
    public FlightStatusService flightStatusService(FlightStatusPersistenceAdapter flightStatusPersistenceAdapter, FlightStatusEventPublisherAdapter flightStatusEventPublisherAdapter) {
        return new FlightStatusService(flightStatusPersistenceAdapter, flightStatusEventPublisherAdapter);
    }

}
