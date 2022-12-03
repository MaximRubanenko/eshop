package ru.max.eshop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.max.eshop.converters.CartConverter;
import ru.max.eshop.dtos.CartDto;
import ru.max.eshop.entities.Cart;
import ru.max.eshop.services.CartService;

/**
 * Rubanenko Maxim
 * 25.11.2022
 */
@RestController
@RequestMapping("/api/V1/cart")
@RequiredArgsConstructor
public class CartController {
  private final CartService cartService;
  private final CartConverter cartConverter;

  @GetMapping("/add/{id}")
    public void addItemToCartById(@PathVariable Long id) {
    cartService.addItemToCartById(id);
  }

  @GetMapping("/del/{id}")
  public void delItemFromCartById (@PathVariable Long id) {
    cartService.delItemFromCartById(id);

  }

  @GetMapping("/all")
  public CartDto showAllItemsInCart() {
    return cartConverter.entityToDto(cartService.showAllItemsInCart());
  }


}
