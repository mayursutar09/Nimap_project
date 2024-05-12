package com.catprod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catprod.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
