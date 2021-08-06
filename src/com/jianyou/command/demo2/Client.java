package com.jianyou.command.demo2;

public class Client {

  public static void main(String[] args) {
    // Command c = new AddRequireCommand();
     Command c = new DeletePageCommand();
     Invoker jianyou = new Invoker(c);
     c.execute();
  }
}
