package ru.max.eshop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.max.eshop.services.NewCartService;
import ru.max.eshop.utils.CartNew;

/**
 * Rubanenko Maxim
 * 03.12.2022
 */
@RestController
@RequestMapping("/api/V2/cart")
@RequiredArgsConstructor
public class NewCartController {
  private final NewCartService newCartService;

  @GetMapping
  public CartNew getCurrentCart() {
    return newCartService.getCurrentCart();
  }

  @GetMapping("/add/{productId}") // Add new product
  public void addProductToCart(@PathVariable Long productId) {
    newCartService.addToNewCart(productId);
  }

  @GetMapping("/inc/{productId}")
  public void incProductInCart(@PathVariable Long productId){
    newCartService.addToNewCart(productId); //The same function as an add new product/ Why not.
  }

  @GetMapping("/minus/{productId}")
  public void minusProductInCart(@PathVariable Long productId){
    newCartService.minusProductInCart(productId);
  }

  @GetMapping("/del/{productId}")
  public void delProductFromCart(@PathVariable Long productId) {
    newCartService.delProductFromCart(productId);
  }

  @GetMapping("/clear")
  public void clearCart(){ newCartService.clearCart(); }

}
