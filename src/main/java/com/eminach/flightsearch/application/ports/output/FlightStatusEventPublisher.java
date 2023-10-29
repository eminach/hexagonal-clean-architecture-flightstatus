package com.eminach.flightsearch.application.ports.output;

import com.eminach.flightsearch.domain.event.FlightStatusCreatedEvent;

public interface FlightStatusEventPublisher {

    void publishFlightStatusCreatedEvent(FlightStatusCreatedEvent event);

}
