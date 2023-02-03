package com.techecommerce.Tech_ECommerce.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {

  private Integer code;
  private byte[] image;
  private String title;
  private String description;
  private String currency;
  private String currencyLocal;
  private Integer quantity;
  private Integer stock;
  private String category;
  private Integer categoryCode;
  private Integer rating;

}
