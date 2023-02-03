package com.techecommerce.Tech_ECommerce.model;

import java.time.Instant;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Integer id;

  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "product_id", nullable = false)
  private Product product;

  @Column(name = "name", nullable = false)
  private Integer code;

  @Column(name = "code", nullable = false)
  private String name;

  @Column(name = "created_date", nullable = false)
  @CreationTimestamp
  private Instant createdDate;

}
