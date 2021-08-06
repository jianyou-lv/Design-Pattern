package com.jianyou.备忘录;

public class Memento {

  private String status = "";

  public Memento(String status){
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
