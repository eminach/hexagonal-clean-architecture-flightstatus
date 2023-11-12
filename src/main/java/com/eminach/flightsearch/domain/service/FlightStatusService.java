package com.eminach.flightsearch.domain.service;

import com.eminach.flightsearch.application.ports.input.GetFlightStatusUseCase;
import com.eminach.flightsearch.application.ports.output.FlightStatusEventPublisher;
import com.eminach.flightsearch.application.ports.output.FlightStatusOutputPort;
import com.eminach.flightsearch.domain.model.AirlinceCode;
import com.eminach.flightsearch.domain.model.FlightStatus;
import com.eminach.flightsearch.domain.model.StatusType;
import com.eminach.flightsearch.infrastructure.adapters.output.persistence.FlightStatusPersistenceAdapter;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

@AllArgsConstructor
public class FlightStatusService implements GetFlightStatusUseCase {

    private static final Logger LOG = LogManager.getLogger(FlightStatusService.class);
    private final FlightStatusOutputPort flightStatusOutputPort;

    private final FlightStatusEventPublisher flightStatusEventPublisher;

    @Override
    public FlightStatus getFlightStatus(AirlinceCode airlinceCode, String flightNumber, Date flightDate) {

        /*
        Implement code get flightstatus from external sources, or entity
        from repository: flightStatusOutputPort.getFlightStatusById()
         */
        //Lets create for simplicity mock object
        FlightStatus flightStatus = new FlightStatus();
        flightStatus.statusType = StatusType.ON_TIME;
        flightStatus.airlinceCode = airlinceCode;
        flightStatus.flightNumber = flightNumber;
        flightStatus.departureStation = "CGN";
        flightStatus.arrivalStation = "BER";
        flightStatus.scheduledDepartureTime =  flightDate;

        LOG.log(Level.INFO, flightStatus.toString());
        return flightStatus;
    }

}
