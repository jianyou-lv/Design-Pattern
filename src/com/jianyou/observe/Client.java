package com.jianyou.observe;

import java.util.Observable;
import java.util.Observer;

public class Client {
  public static void main(String[] args) throws InterruptedException {
     LiSi liSi = new LiSi();
     HanFeiZi hanFeiZi = new HanFeiZi();
     hanFeiZi.hasBreakfast();
     hanFeiZi.haveFun();
  }
}
