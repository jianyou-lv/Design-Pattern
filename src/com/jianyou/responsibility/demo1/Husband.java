package com.jianyou.responsibility.demo1;

public class Husband implements IHandler{
  @Override
  public void HandlerMessage(IWomen women) {
    System.out.println("妻子的请求是："+women.getRequest());
    System.out.println("丈夫的回答是：同意");
  }
}
