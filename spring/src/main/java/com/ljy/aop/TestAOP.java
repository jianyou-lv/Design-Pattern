package com.ljy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class TestAOP {

  //定制切入点
  @Pointcut(value = "execution(* com.ljy.service.*.*(..))")
  private void anyMethod(){}

  @Before("anyMethod()")
  public void beforeAdvice(){
    System.out.println("============前置通知===================");
  }

  @After("anyMethod()")
  public void afterAdvice(){
    System.out.println("===========后置通知===============");
  }


  @AfterReturning("anyMethod()")
  public void afterReturning(){
    System.out.println("=========后置返回通知===========");
  }

  @AfterThrowing("anyMethod()")
  public void afterThrowing(){
    System.out.println("=========异常返回通知=============");
  }

  @Around("anyMethod()")
  public Object around(ProceedingJoinPoint pjp) throws Throwable {
    Object[] args = pjp.getArgs();
    for (Object arg : args) {
      System.out.println(arg);
    }
    String name = pjp.getSignature().getName();
    Object proceed=null;
    try {
      //@Before
      System.out.println("【环绕前置通知】【"+name+"方法开始】");
      /*这句相当于method.invoke(obj,args)，通过反射来执行接口中的方法;因此在反射执行完方法后会有一个返回值proceed*/
      proceed = pjp.proceed();
      //@AfterReturning
      System.out.println("【环绕返回通知】【"+name+"方法返回，返回值："+proceed+"】");
    } catch (Exception e) {
      //@AfterThrowing
      System.out.println("【环绕异常通知】【"+name+"方法异常，异常信息："+e+"】");
    }finally{
      //@After
      System.out.println("【环绕后置通知】【"+name+"方法结束】");
    }
    return proceed;
  }
}
