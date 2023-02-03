package com.techecommerce.Tech_ECommerce.model;

import java.time.Instant;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "currency")
public class Currency {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Integer id;

  @OneToOne(optional = true)
  @JoinColumn(name = "id")
  @MapsId
  private Product product;

  @Column(name = "currency", nullable = false)
  private String currency;

  @Column(name = "local", nullable = false)
  private String local;

  @Column(name = "created_date", nullable = false)
  @CreationTimestamp
  private Instant creadedDate;

}
