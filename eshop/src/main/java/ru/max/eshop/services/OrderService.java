package ru.max.eshop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.max.eshop.entities.Cart;
import ru.max.eshop.entities.Orders;
import ru.max.eshop.repositories.OrderRepository;

/**
 * Rubanenko Maxim
 * 28.11.2022
 */
@Service
@RequiredArgsConstructor
public class OrderService {
  private final OrderRepository orderRepository;
  private final CartService cartService;

  public void saveCartToOrder(){
//    Cart cart = cartService.showAllItemsInCart();
    Orders order = new Orders();
//    order.setId(1L);
    order.setUserid(77L);
    order.setProducts(cartService.showAllItemsInCart().getItems());
    orderRepository.save(order);
  }

}
