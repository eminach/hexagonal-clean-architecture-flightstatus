package com.eminach.flightsearch.infrastructure.adapters.output.eventpublisher;

import com.eminach.flightsearch.application.ports.output.FlightStatusEventPublisher;
import com.eminach.flightsearch.domain.event.FlightStatusCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;

@RequiredArgsConstructor
public class FlightStatusEventPublisherAdapter implements FlightStatusEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void publishFlightStatusCreatedEvent(FlightStatusCreatedEvent event) {
        applicationEventPublisher.publishEvent(event);
    }

}
