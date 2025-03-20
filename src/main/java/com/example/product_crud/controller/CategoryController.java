package com.example.product_crud.controller;

import com.example.product_crud.dto.CategoryDTO;
import com.example.product_crud.dto.CategoryRequest;
import com.example.product_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<CategoryDTO> getAllCategories() {
        return productService.getAllCategoriesWithProducts();
    }

    @PostMapping
    public CategoryDTO createCategory(@RequestBody CategoryRequest categoryRequest) {
        return productService.createCategory(categoryRequest);
    }
}
