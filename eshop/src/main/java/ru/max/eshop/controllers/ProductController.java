package ru.max.eshop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.max.eshop.entities.Product;
import ru.max.eshop.services.ProductService;

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

  @GetMapping
  public List<Product> myGetAllProducts(){
    return productService.myFindAll();
  }
}
