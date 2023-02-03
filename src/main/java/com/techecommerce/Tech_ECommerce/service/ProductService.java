package com.techecommerce.Tech_ECommerce.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.techecommerce.Tech_ECommerce.convert.ProductConvert;
import com.techecommerce.Tech_ECommerce.dto.ProductDto;
import com.techecommerce.Tech_ECommerce.model.Product;
import com.techecommerce.Tech_ECommerce.repository.ProductRepository;

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

  public Product saveProduct(ProductDto productDto) {
    Product saveReturn = null;
    Product product = null;

    if (productDto.getCode() != null) {
      product = productRepository.findById(productDto.getCode()).get();

      if (product != null) {
        product.setImage(productDto.getImage());
        product.setTitle(productDto.getTitle());
        product.setDescription(productDto.getDescription());
        product.getCurrency().setCurrency(productDto.getCurrency());
        product.getCurrency().setLocal(productDto.getCurrencyLocal());
        product.setQuantity(productDto.getQuantity());
        product.getStock().setQuantity(productDto.getStock());
        product.getCategory().setName(productDto.getCategory());
        product.getCategory().setCode(productDto.getCategoryCode());
        product.setRating(productDto.getRating());
      } else {
        return null;
      }
    } else {
      product = ProductConvert.convertToEntity(productDto);
    }

    saveReturn = productRepository.save(product);
    return saveReturn != null ? saveReturn : null;
  }

}
