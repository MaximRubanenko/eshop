package ru.max.eshop.utils;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.max.eshop.entities.Products;

import java.math.BigDecimal;
import java.util.List;

/**
 * Rubanenko Maxim
 * 03.12.2022
 */
@NoArgsConstructor
@Data
public class CartNew {
  private List<CartItem> items;
  private BigDecimal totalPrice;

  public void addToCart(Products p){

    for (CartItem item : items) {
      if(item.getProductId().equals(p.getId())){
        item.incrementQuantity();
        recalculate();
        return;
      }
    }
    CartItem cartItem = new CartItem(p.getId(),p.getCategory().getTitle(),p.getTitle(),1,p.getPrice(),p.getPrice());
    items.add(cartItem);
    recalculate();
  }

  public void clear(){
    items.clear();
    totalPrice = BigDecimal.ZERO;
  }

  private void recalculate(){
    totalPrice = BigDecimal.ZERO;
    for ( CartItem c : items ) {
      totalPrice = totalPrice.add(c.getTotalPriceForAllPosition());
    }
  }

  public void delFromCart(Long productId) {
    getItems().removeIf(p -> p.getProductId().equals(productId));
    recalculate();
  }

  public void minusProductInCart(Long productId){
    for (CartItem item : items) {
      if(item.getProductId().equals(productId)){
        item.decremetQuantity();
        recalculate();
        return;
      }
    }
  }
}
