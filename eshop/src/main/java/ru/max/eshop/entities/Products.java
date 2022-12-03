package ru.max.eshop.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Rubanenko Maxim
 * 25.11.2022
 */
//
//create table products (
//    id      bigserial primary key,
//    title   varchar(255),
//    price numeric(8,2),
//    category_id bigint references categories (id),
//    created_at timestamp default current_timestamp,
//    updated_at timestamp default current_timestamp,
//    enabled boolean
//    );

@Entity
@Table(name = "products")
@NoArgsConstructor
@Data
public class Products {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "order_product",
      joinColumns = @JoinColumn(name = "id_product"),
      inverseJoinColumns = @JoinColumn(name = "id_order")
  )

//  @JsonIgnore
  private List<Orders> orders;


  @Column(name = "title")
  private String title;

  @Column(name = "price")
  private BigDecimal price;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

  @Column(name = "created_at")
  @CreationTimestamp
  private LocalDateTime created_at;

  @UpdateTimestamp
  @Column(name = "updated_at")
  private LocalDateTime updated_at;

  @Column(name = "enabled")
  private Boolean enabled;

}
