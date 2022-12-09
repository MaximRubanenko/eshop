package ru.max.eshop.converters;

import org.springframework.stereotype.Component;
import ru.max.eshop.dtos.ProductDto;
import ru.max.eshop.entities.Products;

import java.util.ArrayList;
import java.util.List;

/**
 * Rubanenko Maxim
 * 02.12.2022
 */
@Component
public class ProductConverter {
  public ProductDto entityToDto(Products p ){
    ProductDto productDto = new ProductDto();
    productDto.setId(p.getId());
    productDto.setTitle(p.getTitle());
    productDto.setCost(p.getPrice());
    productDto.setCategoryTitle(p.getCategory().getTitle());
    return productDto;
  }

  public List<ProductDto> listEntityToDto(List<Products> pl){
    List<ProductDto> lDto = new ArrayList<>();
    for (Products p : pl ) {
      lDto.add(entityToDto(p));
    }
    return lDto;
  }
}
