package ru.max.eshop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.max.eshop.utils.WorkCounter;

/**
 * Rubanenko Maxim
 * 09.12.2022
 */
@RestController
@RequestMapping("/api/V1/statistic")
@RequiredArgsConstructor
public class StatisticController {
  private final WorkCounter workCounter;

  @GetMapping
  public String getServicesTimer(){
    String out;
    out = "Время работы сервиса Product: " + workCounter.getProductCounter() +
          "<p>Время работы сервиса Cart: "    + workCounter.getCartCounter();
    return out;
  }
}
