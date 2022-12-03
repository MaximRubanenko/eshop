package ru.max.eshop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.max.eshop.entities.Cart;
import ru.max.eshop.entities.Products;

/**
 * Rubanenko Maxim
 * 25.11.2022
 */
@Service
@RequiredArgsConstructor
public class CartService {
  private final ProductService productService;
  private final Cart cart;

  public void addItemToCartById(Long id) {
    Products product = productService.myFindId(id).get();
    cart.getItems().add(product);
  }

  public void delItemFromCartById(Long id) {
    cart.getItems().removeIf(product -> product.getId().equals(id));
  }

  public Cart showAllItemsInCart() {
    return cart;
  }

}
