package com.eminach.flightsearch.infrastructure.adapters.input.eventlistener;

import com.eminach.flightsearch.domain.event.FlightStatusCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FlightStatusEventListenerAdapter {

    @EventListener
    public void handle(FlightStatusCreatedEvent event){
        log.info("FlightStatus created");
    }

}
