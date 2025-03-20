package com.example.product_crud.service;

import com.example.product_crud.dto.CategoryDTO;
import com.example.product_crud.dto.CategoryRequest;
import com.example.product_crud.dto.ProductDTO;
import com.example.product_crud.dto.ProductResponse;
import com.example.product_crud.model.Product;
import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProducts();
    ProductResponse createProduct(ProductDTO productDTO);
    ProductResponse getProductById(Long id);
    void deleteProduct(Long id);
    CategoryDTO createCategory(CategoryRequest categoryRequest);
    ProductResponse updateProduct(Long id, ProductDTO productDTO);
    List<CategoryDTO> getAllCategoriesWithProducts();

}