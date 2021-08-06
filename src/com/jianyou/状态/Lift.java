package com.jianyou.状态;

public class Lift implements ILift{
  private int status;

  @Override
  public void setStatus(int status) {
      this.status = status;
  }

  @Override
  public void open() {
    switch (this.status){
      case OPENING_STATUS:  //开门状态，可以关门，同时修改电梯状态
           this.closeLogic();
           this.setStatus(CLOSING_STATUS);
           break;
      case CLOSING_STATUS:
           break;
      case STOPPING_STATUS:
           break;
      case RUNNING_STATUS:
           break;
    }
//    System.out.println("电梯门开启了...");
  }

  private void closeLogic() {
    System.out.println("电梯关门了....");
  }

  @Override
  public void close() {
    switch (this.status){
      case CLOSING_STATUS: //开门状态，可以关门，同时修改电梯状态
        this.openLogic();
        this.setStatus(CLOSING_STATUS);
        break;
      case OPENING_STATUS:
        break;
      case STOPPING_STATUS:
        break;
      case RUNNING_STATUS:
        break;
    }
    System.out.println("电梯门关闭了...");
  }

  private void openLogic() {
    System.out.println("电梯开门了......");
  }

  @Override
  public void run() {
    switch (this.status){
      case STOPPING_STATUS:  //开门状态，可以关门，同时修改电梯状态
        this.runLogic();
        this.setStatus(CLOSING_STATUS);
        break;
      case CLOSING_STATUS:
        break;
      case OPENING_STATUS:
        break;
      case RUNNING_STATUS:
        break;
    }
  }

  private void runLogic() {
    System.out.println("电梯开始运行....");
  }

  @Override
  public void stop() {
    switch (this.status){
      case RUNNING_STATUS:  //开门状态，可以关门，同时修改电梯状态
        this.stopLogic();
        this.setStatus(CLOSING_STATUS);
        break;
      case CLOSING_STATUS:
        break;
      case OPENING_STATUS:
        break;
      case STOPPING_STATUS:
        break;
    }
  }

  private void stopLogic() {
    System.out.println("电梯停止运行..");
  }
}
