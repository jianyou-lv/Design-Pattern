package com.jianyou.responsibility.demo1;

public class Women implements IWomen {
  private int type = 0;
  private String request = "";

  public Women(int type,String request){
    this.type = type;
    this.request = request;
  }

//获得自己的情况
  @Override
  public int getType() {
    return this.type;
  }
//获得妇女的请求
  @Override
  public String getRequest() {
    return this.request;
  }
}
