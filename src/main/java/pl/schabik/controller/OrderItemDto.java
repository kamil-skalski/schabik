package pl.schabik.controller;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;


public record OrderItemDto(
        @NotNull UUID productId,
        @NotNull @Min(0) Integer quantity,
        @NotNull @Min(0) BigDecimal price,
        @NotNull @Min(0) BigDecimal totalPrice
) {
}
