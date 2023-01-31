package com.techecommerce.Tech_ECommerce.convert;

import com.techecommerce.Tech_ECommerce.dto.ProductDto;
import com.techecommerce.Tech_ECommerce.model.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductConvert {

    public static ProductDto convertToDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setCode(product.getId());
        productDto.setImage(product.getImage());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        productDto.setQuantity(product.getQuantity());
        productDto.setStock(product.getStock());
        productDto.setCategory(product.getCategory());
        productDto.setRating(product.getRating());
        return productDto;
    }

    public static List<ProductDto> convertToDtoList(List<Product> products) {
        return products.stream().map(ProductConvert::convertToDto).collect(Collectors.toList());
    }

    public static Product convertToEntity(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getCode());
        product.setImage(productDto.getImage());
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setQuantity(productDto.getQuantity());
        product.setStock(productDto.getStock());
        product.setCategory(productDto.getCategory());
        product.setRating(productDto.getRating());
        return product;
    }

    public static List<Product> convertToProductList(List<ProductDto> productDtos) {
        return productDtos.stream().map(ProductConvert::convertToEntity).collect(Collectors.toList());
    }

}
