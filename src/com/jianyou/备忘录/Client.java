package com.jianyou.备忘录;

public class Client {
  public static void main(String[] args) {
    Boy boy = new Boy();
    //初始化男孩的状态
    boy.setState("心情很棒！");
    System.out.println("==============男孩现在的状态===============");
    System.out.println(boy.getState());
    //用备忘录记录下当前的状态
    Memento memento = boy.createMemento();

    //女孩去追男孩，状态改变
    boy.changeState();
    System.out.println("==============男孩追女孩后的状态===============");
    System.out.println(boy.getState());
    //追女孩失败，恢复原样
    boy.restoreMemento(memento);
    System.out.println("===================男孩恢复后的状态==================");
    System.out.println(boy.getState());
  }
}
