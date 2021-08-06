package com.jianyou.responsibility.demo2;

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
    Handler f = new Father();
    Handler husband = new Husband();
    Handler s = new Son();
    f.setNextHandler(husband);
    husband.setNextHandler(s);

    for (Women women : list) {
      f.HandlerMessage(women);
    }
  }
}
