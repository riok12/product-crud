package com.example.product_crud.service;

import com.example.product_crud.dto.*;
import com.example.product_crud.model.Product;
import com.example.product_crud.model.Category;
import com.example.product_crud.repository.ProductRepository;
import com.example.product_crud.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream().map(this::mapToResponse).collect(Collectors.toList());
    }

    @Override
    public ProductResponse createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setCategory(categoryRepository.findById(productDTO.getCategoryId()).orElseThrow());

        // Generate Code
        if (productDTO.getCode() == null || productDTO.getCode().isEmpty()) {
            String newCode = generateProductCode();
            product.setCode(newCode);
        } else {
            product.setCode(productDTO.getCode());
        }

        product = productRepository.save(product);
        return mapToResponse(product);
    }

    private String generateProductCode() {
        return productRepository.findTopByOrderByCodeDesc()
                .map(p -> "P" + (Integer.parseInt(p.getCode().substring(1)) + 1))
                .orElse("P1000");
    }

    @Override
    public ProductResponse getProductById(Long id) {
        return productRepository.findById(id).map(this::mapToResponse).orElseThrow();
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductResponse updateProduct(Long id, ProductDTO productDTO) {
        Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());

        if (productDTO.getCategoryId() != null) {
            Category category = categoryRepository.findById(productDTO.getCategoryId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));
            product.setCategory(category);
        }

        productRepository.save(product);
        return mapToResponse(product);
    }


    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll().stream().map(c -> {
            CategoryDTO dto = new CategoryDTO();
            dto.setId(c.getId());
            dto.setName(c.getName());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO createCategory(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setName(categoryRequest.getName());
        category = categoryRepository.save(category);

        CategoryDTO dto = new CategoryDTO();
        dto.setId(category.getId());
        dto.setName(category.getName());
        return dto;
    }

    private ProductResponse mapToResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setCode(product.getCode());
        response.setName(product.getName());
        response.setPrice(product.getPrice());
        response.setCategoryId(product.getCategory().getId());
        response.setCategoryDesc(product.getCategory().getName());
        return response;
    }
}