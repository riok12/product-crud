package com.example.product_crud.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductResponse {
    private Long id;
    private String code;
    private String name;
    private Double price;
    private Long categoryId;
    private String categoryDesc;
}
