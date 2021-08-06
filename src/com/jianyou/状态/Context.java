package com.jianyou.状态;

public class Context {

  public static final OpenningState OPENNING_STATE = new OpenningState();
  public static final ClosingStatus CLOSING_STATUS = new ClosingStatus();
  public static final StoppingStatus STOPPING_STATUS = new StoppingStatus();
  public static final RunningStatus RUNNING_STATUS = new RunningStatus();

  private LiftState liftState;

  public LiftState getLiftState() {
    return liftState;
  }

  public void setLiftState(LiftState liftState) {
    this.liftState = liftState;
    this.liftState.setContext(this);
  }

  public void open(){
    this.liftState.open();
  }

  public void close(){
    this.liftState.close();
  }

  public void stop(){
    this.liftState.stop();
  }

  public void run(){
    this.liftState.run();
  }


}
