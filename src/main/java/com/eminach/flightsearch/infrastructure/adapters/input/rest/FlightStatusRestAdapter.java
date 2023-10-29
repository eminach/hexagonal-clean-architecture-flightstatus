package com.eminach.flightsearch.infrastructure.adapters.input.rest;

import com.eminach.flightsearch.application.ports.input.GetFlightStatusUseCase;
import com.eminach.flightsearch.domain.model.FlightStatus;
import com.eminach.flightsearch.infrastructure.adapters.input.rest.data.request.FlightStatusRequest;
import com.eminach.flightsearch.infrastructure.adapters.input.rest.data.response.FlightStatusResponse;
import com.eminach.flightsearch.infrastructure.adapters.input.rest.mapper.FlightStatusRestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class FlightStatusRestAdapter {

    private final GetFlightStatusUseCase getFlightStatusUseCase;

    private final FlightStatusRestMapper flightStatusRestMapper;

    @GetMapping(value = "/flight-status")
    public ResponseEntity<FlightStatusResponse> getFlightStatus(@RequestBody FlightStatusRequest request){
        FlightStatus flightStatus = getFlightStatusUseCase.getFlightStatus(request.airlinceCode, request.flightNumber, request.flightDate);
        return new ResponseEntity<>(flightStatusRestMapper.toFlightStatusQueryResponse(flightStatus), HttpStatus.OK);
    }

}
