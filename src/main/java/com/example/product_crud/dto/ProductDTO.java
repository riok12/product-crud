package com.example.product_crud.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductDTO {
    private String code;
    private String name;
    private Double price;
    private Long categoryId;
}