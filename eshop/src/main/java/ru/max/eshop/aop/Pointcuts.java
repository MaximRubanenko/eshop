package ru.max.eshop.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Rubanenko Maxim
 * 09.12.2022
 */
public class Pointcuts {
  @Pointcut ("execution(public * ru.max.eshop.services.NewCartService.*(..))")
  public void newCartServiceMethods(){};

  @Pointcut ("execution(public * ru.max.eshop.services.ProductService.*(..))")
  public void productServiceMethods(){};

}
