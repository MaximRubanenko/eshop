package ru.max.eshop.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Rubanenko Maxim
 * 27.11.2022
 */
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "")
    private List<Product> items;
}
