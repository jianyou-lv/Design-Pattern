package com.jianyou.状态;

public class Client {
  public static void main(String[] args) {
//     ILift lift = new Lift();
//     lift.open();
//     lift.close();
//     lift.run();
//     lift.stop();
       Context context = new Context();
       context.setLiftState(new ClosingStatus());
       context.open();
       context.close();
       context.run();
       context.stop();

  }
}
