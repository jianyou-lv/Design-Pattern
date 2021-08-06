package com.jianyou.demo1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
  public void commond(GoupLeader goupLeader){
       List<Girls> list = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
       list.add(new Girls());
    }

    goupLeader.countGirls(list);

  }

}
