package com.eminach.flightsearch.infrastructure.adapters.input.rest.data.request;

import com.eminach.flightsearch.domain.model.AirlinceCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlightStatusRequest {

    @NotEmpty(message = "Airline code may not be empty")
    public AirlinceCode airlinceCode;

    @NotEmpty(message = "Description may not be empty")
    public String flightNumber;

    @NotEmpty(message = "flightDate may not be empty")
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    public Date flightDate;

}
