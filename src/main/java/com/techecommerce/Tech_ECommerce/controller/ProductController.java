package com.techecommerce.Tech_ECommerce.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.techecommerce.Tech_ECommerce.convert.ProductConvert;
import com.techecommerce.Tech_ECommerce.dto.ProductDto;
import com.techecommerce.Tech_ECommerce.model.Product;
import com.techecommerce.Tech_ECommerce.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/listAll")
  public ResponseEntity<List<ProductDto>> listAllProducts() {
    List<Product> products = productService.listAllProducts();
    return ResponseEntity.ok(ProductConvert.convertToDtoList(products));
  }

  @PostMapping("/save")
  public ResponseEntity<ProductDto> savePrduct(@RequestBody ProductDto productDto) {
    var dto = new ProductDto();

    if (productDto.getCode() != null) {
      dto.setCode(productDto.getCode());
    }

    dto.setImage(productDto.getImage());
    dto.setTitle(productDto.getTitle());
    dto.setDescription(productDto.getDescription());
    dto.setCurrency(productDto.getCurrency());
    dto.setCurrencyLocal(productDto.getCurrencyLocal());
    dto.setQuantity(productDto.getQuantity());
    dto.setStock(productDto.getStock());
    dto.setCategory(productDto.getCategory());
    dto.setCategoryCode(productDto.getCategoryCode());
    dto.setRating(productDto.getRating());

    var newProduct = productService.saveProduct(dto);
    return ResponseEntity.ok(ProductConvert.convertToDto(newProduct));
  }

}
