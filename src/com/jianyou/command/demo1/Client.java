package com.jianyou.command.demo1;

public class Client {
  public static void main(String[] args) {

    Group g = new RequirementGroup();
    g.find();
    g.add();
    g.plan();
  }
}
