package com.eminach.flightsearch.infrastructure.adapters.input.rest.mapper;

import com.eminach.flightsearch.domain.model.FlightStatus;
import com.eminach.flightsearch.infrastructure.adapters.input.rest.data.response.FlightStatusResponse;
import org.mapstruct.Mapper;

@Mapper
public interface FlightStatusRestMapper {
    FlightStatusResponse toFlightStatusQueryResponse(FlightStatus flightStatus);

}
