package com.eminach.flightsearch.infrastructure.adapters.input.rest.data.response;

import com.eminach.flightsearch.domain.model.AirlinceCode;
import com.eminach.flightsearch.domain.model.StatusType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlightStatusResponse {

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
