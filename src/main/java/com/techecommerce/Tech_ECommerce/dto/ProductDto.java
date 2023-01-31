package com.techecommerce.Tech_ECommerce.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Integer code;
    private byte[] image;
    private String name;
    private String description;
    private String price;
    private Integer quantity;
    private Integer stock;
    private String category;
    private Integer rating;

}
