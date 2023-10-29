package com.eminach.flightsearch.infrastructure.adapters.output.persistence.mapper;

import com.eminach.flightsearch.domain.model.FlightStatus;
import com.eminach.flightsearch.infrastructure.adapters.output.persistence.entity.FlightStatusEntity;
import org.mapstruct.Mapper;

@Mapper
public interface FlightStatusPersistenceMapper {

    FlightStatusEntity toFlightStatusEntity(FlightStatus flightStatus);

    FlightStatus toFlightStatus(FlightStatusEntity flightStatusEntity);

}
