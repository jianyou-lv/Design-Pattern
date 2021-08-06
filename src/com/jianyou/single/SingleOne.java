package com.jianyou.single;
//饿汉
public class SingleOne {
  private static final SingleOne singleOne = new SingleOne();

  private SingleOne(){}

  public static SingleOne getInstance(){
    return singleOne;
  }
}
