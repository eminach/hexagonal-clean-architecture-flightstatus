package com.eminach.flightsearch.application.ports.input;

import com.eminach.flightsearch.domain.model.AirlinceCode;
import com.eminach.flightsearch.domain.model.FlightStatus;

import java.util.Date;

public interface GetFlightStatusUseCase {
    FlightStatus getFlightStatus(AirlinceCode airlinceCode, String flightNumber, Date flightDate);

}
