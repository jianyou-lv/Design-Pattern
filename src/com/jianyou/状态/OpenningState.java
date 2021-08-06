package com.jianyou.状态;

public class OpenningState extends LiftState{
  @Override
  public void open() {
    System.out.println("电梯门开启...");
  }

  @Override
  public void close() {
    super.context.setLiftState(Context.CLOSING_STATUS);
    super.context.getLiftState().close();
  }

  @Override
  public void run() {

  }

  @Override
  public void stop() {

  }
}
