package ru.max.eshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.max.eshop.entities.Orders;

/**
 * Rubanenko Maxim
 * 28.11.2022
 */
@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
}
