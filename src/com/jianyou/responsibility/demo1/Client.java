package com.jianyou.responsibility.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
  public static void main(String[] args) {
    Random r = new Random();
    List<Women> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
       list.add(new Women(r.nextInt(4),"我要出去逛街"));
    }
    //定义三个请示对象
    IHandler father = new Father();
    IHandler husband = new Husband();
    IHandler son = new Son();

    for (Women women : list) {
        switch (women.getType()){
          case 1:
            father.HandlerMessage(women);
            break;
          case 2:
            husband.HandlerMessage(women);
            break;
          case 3:
            son.HandlerMessage(women);
            break;
          default:
            break;
        }
    }
  }
}
