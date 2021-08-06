package com.jianyou.状态;

public interface ILift {

 int OPENING_STATUS = 1;
 int CLOSING_STATUS = 2;
 int RUNNING_STATUS = 3;
 int STOPPING_STATUS = 4;

 void setStatus(int status);
 void open();
 void close();
 void run();
 void stop();
}

