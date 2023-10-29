package com.eminach.flightsearch.domain.exception;

public class FlightNotFound extends RuntimeException {

    public FlightNotFound(String message) {
        super(message);
    }

}
