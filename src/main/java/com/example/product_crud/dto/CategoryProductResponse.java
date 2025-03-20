package com.example.product_crud.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryProductResponse {
    private Long id;
    private String code;
    private String name;
    private Double price;
    private Long categoryId;
}
