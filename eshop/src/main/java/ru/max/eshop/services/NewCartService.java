package ru.max.eshop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.max.eshop.entities.Products;
import ru.max.eshop.utils.CartNew;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * Rubanenko Maxim
 * 03.12.2022
 */
@Service
@RequiredArgsConstructor
public class NewCartService {
  private CartNew cartNew;
  private final ProductService productService;

  @PostConstruct
  public void init() {
    cartNew = new CartNew();
    cartNew.setItems(new ArrayList<>());
  }

  public CartNew  getCurrentCart() {
    return cartNew;
  }


  public void addToNewCart(Long productId) {
    Products p = productService.myFindId(productId).get();
    cartNew.addToCart(p);
  }

  public void delProductFromCart(Long productId) {
    cartNew.delFromCart(productId);
        //getItems().removeIf(p -> p.getProductId().equals(productId));
  }

  public void minusProductInCart(Long productId) {
    cartNew.minusProductInCart(productId);
  }

  public void clearCart() {
    cartNew.clear();
  }
}
