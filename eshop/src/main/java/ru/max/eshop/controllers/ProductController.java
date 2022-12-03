package ru.max.eshop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.max.eshop.converters.ProductConverter;
import ru.max.eshop.dtos.ProductDto;
import ru.max.eshop.entities.Products;
import ru.max.eshop.services.ProductService;

import java.util.ArrayList;
import java.util.List;

/**
 * Rubanenko Maxim
 * 25.11.2022
 */
@RestController
@RequestMapping("/api/V1/products")
@RequiredArgsConstructor
public class ProductController {
  private final ProductService productService;
  private final ProductConverter productConverter;

  @GetMapping
  public List<ProductDto> myGetAllProducts() {
//    List<ProductDto> productDtos = new ArrayList<>();
//    List<Products> products;
//    products = productService.myFindAll();
//    for (Products p : products) {
//        productDtos.add(productConverter.entityToDto(p));
//    }
//    return productDtos;
    List<Products> products;
    products = productService.myFindAll();
    return productConverter.listEntityToDto(products);
  }
}
