package ru.max.eshop.utils;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * Rubanenko Maxim
 * 09.12.2022
 */
@Data
@RequiredArgsConstructor
@Component
public class WorkCounter {
  private Long productCounter;
  private Long cartCounter;

  @PostConstruct
  public void init() {
    productCounter  = 0L;
    cartCounter = 0L;
  }

}
