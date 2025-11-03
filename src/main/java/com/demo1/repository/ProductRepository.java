package com.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo1.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
