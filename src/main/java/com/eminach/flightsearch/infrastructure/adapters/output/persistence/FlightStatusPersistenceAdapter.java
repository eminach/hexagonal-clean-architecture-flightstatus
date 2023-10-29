package com.eminach.flightsearch.infrastructure.adapters.output.persistence;

import com.eminach.flightsearch.domain.model.FlightStatus;
import com.eminach.flightsearch.application.ports.output.FlightStatusOutputPort;
import com.eminach.flightsearch.infrastructure.adapters.output.persistence.entity.FlightStatusEntity;
import com.eminach.flightsearch.infrastructure.adapters.output.persistence.mapper.FlightStatusPersistenceMapper;
import com.eminach.flightsearch.infrastructure.adapters.output.persistence.repository.FlightStatusRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class FlightStatusPersistenceAdapter implements FlightStatusOutputPort {

    private final FlightStatusRepository flightStatusRepository;

    private final FlightStatusPersistenceMapper flightStatusPersistenceMapper;

    @Override
    public FlightStatus saveFlightStatus(FlightStatus flightStatus) {
        FlightStatusEntity flightStatusEntity = flightStatusPersistenceMapper.toFlightStatusEntity(flightStatus);
        flightStatusEntity = flightStatusRepository.save(flightStatusEntity);
        return flightStatusPersistenceMapper.toFlightStatus(flightStatusEntity);
    }

    @Override
    public Optional<FlightStatus> getEWFlightStatusByNumber(String flightNumber) {
        Optional<FlightStatusEntity> flightStatusEntity = flightStatusRepository.findByFlightNumber(flightNumber);

        if(flightStatusEntity.isEmpty()) {
            return Optional.empty();
        }

        FlightStatus flightStatus = flightStatusPersistenceMapper.toFlightStatus(flightStatusEntity.get());
        return Optional.of(flightStatus);
    }
}
