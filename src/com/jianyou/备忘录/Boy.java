package com.jianyou.备忘录;

public class Boy {
  private String state = "";

  public void changeState(){
    this.state = "心情可能很不好.....";
  }

  public String getState(){
    return state;
  }

  public void setState(String state){
    this.state = state;
  }
 //保留一个备份
  public Memento createMemento(){
    return new Memento(this.state);
  }

  public void restoreMemento(Memento memento){
      this.state = memento.getStatus();
  }
}
