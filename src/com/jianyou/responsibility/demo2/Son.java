package com.jianyou.responsibility.demo2;

import com.jianyou.responsibility.demo1.IWomen;

public class Son extends Handler{


  public Son() {
    super(Handler.SON_LEVEL_REQUEST);
  }

  @Override
  protected void response(IWomen women) {
    System.out.println("=========母亲向儿子请求=============");
    System.out.println(women.getRequest());
    System.out.println("儿子的回复是：同意");
  }
}
