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
    public StatusType statusType;

    public AirlinceCode airlinceCode;

    public String flightNumber;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    public Date scheduledDepartureTime;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    public Date scheduledArrivalTime;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    public Date updatedDepartureTime;

    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    public Date updatedArrivalTime;

    @NotNull
    public String departureStation;

    @NotNull
    public String arrivalStation;

    @NotNull
    public String gate;

}

