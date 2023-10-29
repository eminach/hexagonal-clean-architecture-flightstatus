package com.eminach.flightsearch.domain.service;

import com.eminach.flightsearch.application.ports.input.GetFlightStatusUseCase;
import com.eminach.flightsearch.application.ports.output.FlightStatusEventPublisher;
import com.eminach.flightsearch.application.ports.output.FlightStatusOutputPort;
import com.eminach.flightsearch.domain.model.AirlinceCode;
import com.eminach.flightsearch.domain.model.FlightStatus;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class FlightStatusService implements GetFlightStatusUseCase {

    private final FlightStatusOutputPort flightStatusOutputPort;

    private final FlightStatusEventPublisher flightStatusEventPublisher;

    @Override
    public FlightStatus getFlightStatus(AirlinceCode airlinceCode, String flightNumber, Date flightDate) {

        /*
        Implement code get flightstatus from external sources, or entity
        from repository: flightStatusOutputPort.getFlightStatusById()
         */

        FlightStatus flightStatus = new FlightStatus();

        return flightStatus;
    }

}
