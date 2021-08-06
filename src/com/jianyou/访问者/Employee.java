package com.jianyou.访问者;

public abstract class Employee {

    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private String name;  //员工姓名
    private int salary;  //员工薪水

    private int sex;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }
//在方法上加final，代表这个方法不能被重写
  public final void report(){
    System.out.println("姓名===============>"+getName());
    System.out.println("性别===============>"+getSex());
    System.out.println("薪水===============>"+getSalary());
    System.out.println(this.getOtherInfo());
    System.out.println("************************************************");
  }

  @Deprecated
  protected abstract String getOtherInfo();

  public abstract void accept(IVisitor vistor);
}
