package com.jianyou.responsibility.demo2;

import com.jianyou.responsibility.demo1.IWomen;

public class Husband extends Handler{
  public Husband() {
    super(Handler.HUSBAND_LEVEL_REQUEST);
  }

  @Override
  protected void response(IWomen women) {
    System.out.println("===========妻子向丈夫请求===========");
    System.out.println(women.getRequest());
    System.out.println("丈夫的回复是：同意");
  }
}
