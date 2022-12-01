package ru.max.eshop.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Rubanenko Maxim
 * 25.11.2022
 */
@Data
@Component
@NoArgsConstructor

public class Cart {
  private Long user;
  private List<Products> items;

  @PostConstruct
  public void init() {
    this.items = new ArrayList<>();
    this.user = 77L;
  }


}
