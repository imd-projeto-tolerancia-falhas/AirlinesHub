package com.airlineshub.dto.requests;

import java.time.LocalDate;

public record SellFlightRequest(String flight, LocalDate date) {
}
