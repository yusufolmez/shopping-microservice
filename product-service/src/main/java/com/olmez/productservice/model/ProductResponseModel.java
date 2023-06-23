package com.olmez.productservice.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponseModel {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
