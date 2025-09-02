package ek.osnb.jpa.dto;

public record OrderLineDto(Long id, double unitPrice, int quantity, String product) {
}