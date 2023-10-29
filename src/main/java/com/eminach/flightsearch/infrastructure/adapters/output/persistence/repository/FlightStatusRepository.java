package com.eminach.flightsearch.infrastructure.adapters.output.persistence.repository;

import com.eminach.flightsearch.infrastructure.adapters.output.persistence.entity.FlightStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightStatusRepository extends JpaRepository<FlightStatusEntity, String> {

    Optional<FlightStatusEntity> findByFlightNumber(String flightNumber);
}
