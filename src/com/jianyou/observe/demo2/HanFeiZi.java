package com.jianyou.observe.demo2;

import com.jianyou.observe.IHanFeiZi;
import com.jianyou.observe.LiSi;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements IObserver, IHanFeiZi {

  private List<IObserver> list = new ArrayList<>();

  private boolean isHavingBreakFast = false;
  private boolean isHavingFun = false;

  @Override
  public void hasBreakfast() {
    System.out.println("韩非子开始吃午饭了.........");
    this.isHavingBreakFast = true;
  }

  @Override
  public void haveFun() {
    System.out.println("韩非子开始娱乐了...........");
    this.isHavingFun = true;

  }

  public boolean isHavingBreakFast() {
    return isHavingBreakFast;
  }

  public void setHavingBreakFast(boolean havingBreakFast) {
    isHavingBreakFast = havingBreakFast;
  }

  public boolean isHavingFun() {
    return isHavingFun;
  }

  public void setHavingFun(boolean havingFun) {
    isHavingFun = havingFun;
  }

  @Override
  public void addObserver(IObserver observer) {
    this.list.add(observer);
  }

  @Override
  public void deleteObserver(IObserver observer) {
    this.list.remove(observer);
  }

  //通知所有的观察者
  @Override
  public void notifyObserver(String str) {
    for(IObserver observer:list){
      observer.notifyObserver(str);
    }
  }
}
