package com.example.product_crud.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
