package com.airlineshub.controllers;

import com.airlineshub.dto.requests.SellFlightRequest;
import com.airlineshub.services.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping(value = "/flight")
    public ResponseEntity<?> getFlight(@RequestParam String flight, @RequestParam LocalDate day) {
        return ResponseEntity.ok(flightService.getFlight(flight, day));
    }

    @PostMapping(value = "/sell")
    public ResponseEntity<?> sellFlight(@RequestBody SellFlightRequest request) {
        return ResponseEntity.ok(flightService.sellFlight(request));
    }

}
