package com.eminach.flightsearch.infrastructure.adapters.input.rest.data.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlightStatusResponse {

    private Long id;

    private String name;

    private String description;

}
