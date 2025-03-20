package com.example.product_crud.repository;

import com.example.product_crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findTopByOrderByCodeDesc();
}


