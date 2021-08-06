package com.jianyou.single;
//Double Check
public class SingleThree {

  private static SingleThree singleThree = null;
  private SingleThree(){}

  public static SingleThree getInstance(){
    if(singleThree==null){
      synchronized (SingleThree.class) {
        if (singleThree == null) {
           singleThree = new SingleThree();
        }
      }
    }
    return singleThree;
  }


}
