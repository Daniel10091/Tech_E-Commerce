package com.techecommerce.Tech_ECommerce.model;

import java.time.Instant;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "stock")
public class Stock {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Integer id;

  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "product_id", nullable = false)
  private Product product;

  @Column(name = "quantity", nullable = false)
  private Integer quantity;

  @Column(name = "created_date", nullable = false)
  @CreationTimestamp
  private Instant createdDate;
  
}
