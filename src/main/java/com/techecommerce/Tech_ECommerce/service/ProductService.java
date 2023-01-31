package com.techecommerce.Tech_ECommerce.service;

import com.techecommerce.Tech_ECommerce.model.Product;
import com.techecommerce.Tech_ECommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

}
