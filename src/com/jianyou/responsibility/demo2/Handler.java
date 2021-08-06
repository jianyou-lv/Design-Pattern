package com.jianyou.responsibility.demo2;

import com.jianyou.responsibility.demo1.IHandler;
import com.jianyou.responsibility.demo1.IWomen;

public abstract class Handler {

  public static final int FATHER_LEVEL_REQUEST = 1;
  public static final int HUSBAND_LEVEL_REQUEST = 2;
  public static final int SON_LEVEL_REQUEST = 3;

  //能够处理的级别
  private int level = 0;
  //责任传递，下一个人的责任人是谁
  private Handler nextHandler;

  public Handler(int level){
    this.level = level;
  }

  public final void  HandlerMessage(IWomen women){
     if(women.getType()==this.level){
       this.response(women);
     } else{
       if(this.nextHandler!=null){
         this.nextHandler.response(women);
       }else{
         //后续已经没有处理人了，不用处理了
         System.out.println("---没地方请示了，按照不同意处理-------");
       }
     }
  }

  public void setNextHandler(Handler handler){
    this.nextHandler = handler;
  }


  protected abstract void response(IWomen women);

}
