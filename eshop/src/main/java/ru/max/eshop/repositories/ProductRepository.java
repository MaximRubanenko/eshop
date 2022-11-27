package ru.max.eshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.max.eshop.entities.Product;

/**
 * Rubanenko Maxim
 * 25.11.2022
 */
@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {
}
