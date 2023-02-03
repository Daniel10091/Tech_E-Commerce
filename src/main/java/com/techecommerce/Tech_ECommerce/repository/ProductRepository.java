package com.techecommerce.Tech_ECommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techecommerce.Tech_ECommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
