package ru.max.eshop.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Rubanenko Maxim
 * 02.12.2022
 */
@Data
@NoArgsConstructor
public class ProductDto {
  private Long id;
  private String title;
  private BigDecimal cost;
  private String categotyTitle;
}
