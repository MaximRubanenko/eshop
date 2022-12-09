package ru.max.eshop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.max.eshop.services.CartService;
import ru.max.eshop.services.NewCartService;
import ru.max.eshop.services.OrderService;

/**
 * Rubanenko Maxim
 * 28.11.2022
 */
@RestController
@RequestMapping("/api/V1/order")
@RequiredArgsConstructor
public class OrderController {
  private final OrderService orderService;


  @GetMapping("/save")
  public void SaveCartToOrder () {
    orderService.saveCartToOrder();
  }
}
