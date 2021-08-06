package com.jianyou.状态;

public class StoppingStatus extends LiftState{
  @Override
  public void open() {
      super.context.setLiftState(Context.OPENNING_STATE);
      super.context.getLiftState().open();
  }

  @Override
  public void close() {

  }

  @Override
  public void run() {
    super.context.setLiftState(Context.RUNNING_STATUS);
    super.context.getLiftState().run();
  }

  @Override
  public void stop() {
    System.out.println("电梯停止了.....");
  }
}
