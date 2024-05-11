
package com.example.supermarketbilling.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private double price;
    private int quantityAvailable;

    @ManyToMany(mappedBy = "products")
    private Set<Invoice> invoices = new HashSet<>();
}