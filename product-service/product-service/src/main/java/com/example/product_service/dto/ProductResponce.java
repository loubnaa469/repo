package com.example.product_service.dto;

import java.math.BigDecimal;

public record ProductResponce(String id, String name, String description, BigDecimal price) {
}
