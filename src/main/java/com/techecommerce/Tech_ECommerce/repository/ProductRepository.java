package com.techecommerce.Tech_ECommerce.repository;

import com.techecommerce.Tech_ECommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
