package com.jianyou.observe;

public class HanFeiZi implements IHanFeiZi{
  private LiSi liSi = new LiSi();

  private boolean isHavingBreakFast = false;
  private boolean isHavingFun = false;

  @Override
  public void hasBreakfast() {
    System.out.println("韩非子开始吃午饭了.........");
    this.isHavingBreakFast = true;
    this.liSi.update("韩非子开始吃午饭了");
  }

  @Override
  public void haveFun() {
    System.out.println("韩非子开始娱乐了...........");
    this.isHavingFun = true;
    this.liSi.update("韩非子开始吃娱乐");

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

}
