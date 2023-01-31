package com.techecommerce.Tech_ECommerce.controller;

import com.techecommerce.Tech_ECommerce.convert.ProductConvert;
import com.techecommerce.Tech_ECommerce.dto.ProductDto;
import com.techecommerce.Tech_ECommerce.model.Product;
import com.techecommerce.Tech_ECommerce.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<ProductDto>> listAllProducts() {
        List<Product> products = ProductService.listAllProducts();
        return ResponseEntity.ok(ProductConvert.convertToDtoList(products));
    }

}
