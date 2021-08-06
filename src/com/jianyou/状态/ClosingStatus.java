package com.jianyou.状态;

public class ClosingStatus extends LiftState{
  @Override
  public void open() {
     super.context.setLiftState(Context.OPENNING_STATE);
     super.context.getLiftState().open();
  }

  @Override
  public void close() {
    System.out.println("电梯门关门.........");
  }

  @Override
  public void run() {
    super.context.setLiftState(Context.RUNNING_STATUS);
    super.context.getLiftState().run();
  }

  @Override
  public void stop() {
    super.context.setLiftState(Context.STOPPING_STATUS);
    super.context.getLiftState().stop();
  }
}
