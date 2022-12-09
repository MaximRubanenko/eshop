package ru.max.eshop.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Rubanenko Maxim
 * 03.12.2022
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CartItem {
  private Long productId;
  private String categoryTitle;
  private String productTitle;
  private int quantity;
  private BigDecimal pricePerProduct;
  private BigDecimal totalPriceForAllPosition;

  public void incrementQuantity(){
    if (quantity != 2147483647) {
      quantity++;
      totalPriceForAllPosition = totalPriceForAllPosition.add(pricePerProduct);
    }
  }

  public void decremetQuantity() {
    if(quantity != 1) {
      quantity--;
      totalPriceForAllPosition = totalPriceForAllPosition.subtract(pricePerProduct);
    }
  }
}
