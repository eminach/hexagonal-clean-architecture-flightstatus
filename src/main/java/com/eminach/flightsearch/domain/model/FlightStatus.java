package com.eminach.flightsearch.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlightStatus {

    @NotNull
    private StatusType statusType;

    private AirlinceCode airlinceCode;

    private String flightNumber;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date scheduledDepartureTime;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date scheduledArrivalTime;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updatedDepartureTime;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date updatedArrivalTime;

    @NotNull
    private String departureStation;

    @NotNull
    private String arrivalStation;

    @NotNull
    private String gate;

}

