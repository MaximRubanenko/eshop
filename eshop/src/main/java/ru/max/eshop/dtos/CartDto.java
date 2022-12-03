package ru.max.eshop.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.max.eshop.entities.Products;

import java.util.List;

/**
 * Rubanenko Maxim
 * 03.12.2022
 */
@NoArgsConstructor
@Data
public class CartDto {
  private Long user;
  private List<ProductDto> items;
}
