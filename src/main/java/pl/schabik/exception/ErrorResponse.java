package pl.schabik.exception;

import java.time.Instant;

public record ErrorResponse(
        String message,
        Instant timestamp) {

    public ErrorResponse(String message) {
        this(message, Instant.now());
    }
}
