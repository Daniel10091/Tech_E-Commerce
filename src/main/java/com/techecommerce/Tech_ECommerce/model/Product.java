package com.techecommerce.Tech_ECommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {

    private Integer id;
    private byte[] image;
    private String name;
    private String description;
    private String price;
    private Integer quantity;
    private Integer stock;
    private String category;
    private Integer rating;

}
