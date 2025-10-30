package com.airlineshub.services;

import com.airlineshub.dto.requests.SellFlightRequest;
import com.airlineshub.dto.responses.FlightResponse;
import com.airlineshub.dto.responses.SellResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

@Service
public class FlightService {

    public FlightResponse getFlight(String flight, LocalDate day) {
        return new FlightResponse(flight, day, BigDecimal.valueOf(100.00));
    }

    public SellResponse sellFlight(SellFlightRequest request) {
        return new SellResponse(UUID.randomUUID());
    }

}
