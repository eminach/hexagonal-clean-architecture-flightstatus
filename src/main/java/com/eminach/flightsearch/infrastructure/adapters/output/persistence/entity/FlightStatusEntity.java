package com.eminach.flightsearch.infrastructure.adapters.output.persistence.entity;

import com.eminach.flightsearch.domain.model.AirlinceCode;
import com.eminach.flightsearch.domain.model.StatusType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlightStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private StatusType statusType;

    @NotNull
    private AirlinceCode airlinceCode;

    @NotNull
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
