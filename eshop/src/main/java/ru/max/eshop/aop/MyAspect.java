package ru.max.eshop.aop;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import ru.max.eshop.utils.WorkCounter;

import java.sql.Timestamp;

/**
 * Rubanenko Maxim
 * 09.12.2022
 */
@Component
@Aspect
@Slf4j
@RequiredArgsConstructor
public class MyAspect {
  private final WorkCounter workCounter;
  Timestamp timeStart;
  Timestamp timeFinish;

  @Before("Pointcuts.newCartServiceMethods()")
  public void beforeNewCartMethod(JoinPoint joinPoint) throws Throwable {
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    timeStart = new Timestamp(System.currentTimeMillis());
  }

  @After("Pointcuts.newCartServiceMethods()")
  public void afterNewCartMethod(JoinPoint joinPoint) throws Throwable {
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    timeFinish = new Timestamp(System.currentTimeMillis());
//    log.info("Время выполнения метода сервиса NewCartService " + methodSignature.getName() + (timeFinish.getTime() - timeStart.getTime()));
    workCounter.setCartCounter(workCounter.getCartCounter() +  (timeFinish.getTime() - timeStart.getTime()));
  }

  @Before("Pointcuts.productServiceMethods()")
  public void beforeProductMethod(JoinPoint joinPoint) throws Throwable {
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    timeStart = new Timestamp(System.currentTimeMillis());
  }

  @After("Pointcuts.productServiceMethods()")
  public void afterProductMethod(JoinPoint joinPoint) throws Throwable {
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    timeFinish = new Timestamp(System.currentTimeMillis());

//    log.info("Время выполнения метода сервиса Products: " + methodSignature.getName() + (timeFinish.getTime() - timeStart.getTime()));
    workCounter.setProductCounter(workCounter.getProductCounter() + (timeFinish.getTime() - timeStart.getTime()));
  }


}
