package com.olmez.orderservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order")
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Long price;

    public Order(String name, String description, Long price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
