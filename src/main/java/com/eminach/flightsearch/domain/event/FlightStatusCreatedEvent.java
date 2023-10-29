package com.eminach.flightsearch.domain.event;

import com.eminach.flightsearch.domain.model.StatusType;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class FlightStatusCreatedEvent {

    private StatusType type;
    private String departureStation;
    private String arrivalStation;
    private Date scheduledDepartureTime;
    private Date scheduledArrivalTime;
    private Date updatedDepartureTime;
    private Date updatedArrivalTime;
    private String gate;
}

