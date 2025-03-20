package com.example.product_crud.dto;

import lombok.*;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CategoryDTO {
    private Long id;
    private String name;
}