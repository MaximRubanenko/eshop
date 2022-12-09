package ru.max.eshop.entities;

import jdk.jfr.Enabled;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Rubanenko Maxim
 * 02.12.2022
 */
@Entity
@Table(name = "categories")
@NoArgsConstructor
@Data
public class Category {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "title")
  private String title;

  @OneToMany(mappedBy = "category")
  private List<Products> products;

  @Column(name = "enabled")
  private Boolean enabled;
}
