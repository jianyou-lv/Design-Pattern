package com.jianyou.状态;

public class RunningStatus  extends LiftState{
  @Override
  public void open() {

  }

  @Override
  public void close() {

  }

  @Override
  public void run() {
    System.out.println("电梯上下运行........");
  }

  @Override
  public void stop() {
    super.context.setLiftState(Context.STOPPING_STATUS);
    super.context.getLiftState().stop();
  }
}
