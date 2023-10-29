package com.eminach.flightsearch.application.ports.output;

import com.eminach.flightsearch.domain.model.FlightStatus;

import java.util.Optional;

public interface FlightStatusOutputPort {

    FlightStatus saveFlightStatus(FlightStatus flightStatus);

    Optional<FlightStatus> getEWFlightStatusByNumber(String flightNumber);

}
