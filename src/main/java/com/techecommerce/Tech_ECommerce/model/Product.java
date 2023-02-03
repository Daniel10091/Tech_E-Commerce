package com.techecommerce.Tech_ECommerce.model;

import java.time.Instant;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "image", nullable = false)
  private byte[] image;

  @Column(name = "title", length = 255, nullable = false)
  private String title;

  @Column(name = "description", length = 255, nullable = true)
  private String description;

  @OneToOne(mappedBy = "products", cascade = CascadeType.ALL, optional = true)
  private Currency currency;

  @Column(name = "quantity", nullable = true)
  private Integer quantity;
  
  @OneToOne(mappedBy = "products", cascade = CascadeType.ALL, optional = true)
  private Stock stock;

  @OneToOne(mappedBy = "products", cascade = CascadeType.ALL, optional = true)
  private Category category;

  @Column(name = "rating", nullable = false)
  private Integer rating;

  @Column(name = "created_date", nullable = false)
  @CreationTimestamp
  private Instant createdDate;

}
