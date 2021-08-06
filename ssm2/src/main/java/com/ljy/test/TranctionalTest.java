package com.ljy.test;


import org.springframework.transaction.annotation.Transactional;

public class TranctionalTest {

  @Transactional
  public void methodA(){
    System.out.println("这是一组事务操作....");
    System.out.println("插入数据...");
    System.out.println("修改数据....");
    System.out.println("删除数据....");
  }

  @Transactional
  public void methodB(){
    methodA();
  }


}
