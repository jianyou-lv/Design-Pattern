package com.jianyou.strategy;

public class ListenStrategy  implements IStrategy{
  @Override
  public void operate() {
    System.out.println("声东击西走一波");
  }
}
