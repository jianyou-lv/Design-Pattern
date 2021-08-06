package com.jianyou.访问者;

public class CommenEmployee extends Employee{

  private String job;  //工作内容

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  protected String getOtherInfo() {
    return "工作=============>"+this.job;
  }

  @Override
  public void accept(IVisitor vistor) {
     vistor.visit(this);
  }
}
