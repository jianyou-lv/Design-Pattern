package com.jianyou.responsibility.demo1;

public class Son implements IHandler{
  @Override
  public void HandlerMessage(IWomen women) {
    System.out.println("母亲的请求是："+women.getRequest());
    System.out.println("儿子的回答是：同意");
  }
}
