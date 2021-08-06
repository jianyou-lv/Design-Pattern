package com.jianyou.访问者;

public class Manager extends Employee{
  private String performance;

  public String getPerformance() {
    return performance;
  }

  public void setPerformance(String performance) {
    this.performance = performance;
  }

  @Override
  protected String getOtherInfo() {
    return "业绩===========>"+getPerformance();
  }


  @Override
  public void accept(IVisitor vistor) {
     vistor.visit(this);
  }
}
