package com.jianyou.single;
//静态内部类形式
public class SingleFour {

 private SingleFour(){}

    private static class SingleFourInner{
      private static final SingleFour singleFour = new SingleFour();
    }

    public static SingleFour getInstance(){
     return SingleFourInner.singleFour;
    }
}
