package com.jianyou.single;
//懒汉式
public class SingleTwo {

  private static SingleTwo singleTwo = null;

  private SingleTwo(){}

  public static SingleTwo getInstance(){
     if(singleTwo==null){
       singleTwo = new SingleTwo();
     }
     return singleTwo;
  }
}
