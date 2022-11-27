package ru.max.eshop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.max.eshop.entities.Product;
import ru.max.eshop.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

/**
 * Rubanenko Maxim
 * 25.11.2022
 */
@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;
  public List<Product> myFindAll(){
    return productRepository.findAll();
  }

  public Optional<Product> myFindId(Long id){
    return productRepository.findById(id);
  }
}
