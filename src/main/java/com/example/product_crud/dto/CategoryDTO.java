package com.example.product_crud.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CategoryDTO {
    private Long id;
    private String name;
    private List<CategoryProductResponse> products;
}