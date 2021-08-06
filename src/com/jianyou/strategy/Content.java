package com.jianyou.strategy;

public class Content {
  private IStrategy strategy;

  public Content(IStrategy strategy){
    this.strategy = strategy;
  }

  public void operate(){
    strategy.operate();
  }

  public void setStrategy(IStrategy strategy){
    this.strategy = strategy;
  }


}
