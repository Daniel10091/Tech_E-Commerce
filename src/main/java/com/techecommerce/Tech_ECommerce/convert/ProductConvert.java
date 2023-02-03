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
    productDto.setTitle(product.getTitle());
    productDto.setDescription(product.getDescription());
    productDto.setCurrency(product.getCurrency().getCurrency());
    productDto.setCurrencyLocal(product.getCurrency().getLocal());
    productDto.setQuantity(product.getQuantity());
    productDto.setStock(product.getStock().getQuantity());
    productDto.setCategoryCode(product.getCategory().getCode());
    productDto.setCategory(product.getCategory().getName());
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
    product.setTitle(productDto.getTitle());
    product.setDescription(productDto.getDescription());
    product.getCurrency().setCurrency(productDto.getCurrency());
    product.getCurrency().setLocal(productDto.getCurrencyLocal());
    product.setQuantity(productDto.getQuantity());
    product.getStock().setQuantity(productDto.getStock());
    product.getCategory().setCode(productDto.getCategoryCode());
    product.getCategory().setName(productDto.getCategory());
    product.setRating(productDto.getRating());
    return product;
  }

  public static List<Product> convertToProductList(List<ProductDto> productDtos) {
    return productDtos.stream().map(ProductConvert::convertToEntity).collect(Collectors.toList());
  }

}
