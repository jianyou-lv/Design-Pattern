package com.jianyou.iterator.demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
  public static void main(String[] args) {
      List<Project> list = new ArrayList<>();
      list.add(new Project("过山车",50,10000));
      list.add(new Project("海盗船",10,80000));
      list.add(new Project("跳楼机",80,50000));
      list.add(new Project("旋转木马",5,5000));
    for (Project project : list) {
      System.out.println(project.getProjectInfo());
    }
  }
}
