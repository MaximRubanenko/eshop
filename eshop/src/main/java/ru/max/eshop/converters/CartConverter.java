package ru.max.eshop.converters;

import org.springframework.stereotype.Component;
import ru.max.eshop.dtos.CartDto;
import ru.max.eshop.entities.Cart;

/**
 * Rubanenko Maxim
 * 03.12.2022
 */
@Component
public class CartConverter {
  ProductConverter productConverter = new ProductConverter();
  public CartDto entityToDto(Cart c){
    CartDto cartDto = new CartDto();
    cartDto.setUser(c.getUser());
    cartDto.setItems(productConverter.listEntityToDto(c.getItems()));
    return cartDto;
  }
}
