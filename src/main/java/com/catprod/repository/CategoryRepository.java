package com.catprod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catprod.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
