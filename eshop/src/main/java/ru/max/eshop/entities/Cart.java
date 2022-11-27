package ru.max.eshop.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
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
  private Long userId;
  private List<Product> items;

  @PostConstruct
  public void init() {
    this.items = new ArrayList<>();
    this.userId = 1L;
  }


}
