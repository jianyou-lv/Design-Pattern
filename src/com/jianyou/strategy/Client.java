package com.jianyou.strategy;

public class Client {
  public static void main(String[] args) {
     Content content = new Content(new GoRunStrategy());

    System.out.println("请开始你的计谋..........");
    content.operate();
    System.out.println("========================================");

    content.setStrategy(new ListenStrategy());
    content.operate();
  }
}
