package com.jianyou.iterator.demo1;

public class Project implements Iproject {

  private String name;
  private int num = 0;
  private int cost = 0;

  public Project(String name, int num, int cost) {
    this.name = name;
    this.num = num;
    this.cost = cost;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  @Override
  public String getProjectInfo() {
    String info = "";
    info = info + " 项目的名称是："+name+"  项目的人数是："+num+"  项目的花费是："+cost;
    return info;
  }
}
