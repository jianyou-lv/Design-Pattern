package com.jianyou.访问者;

public class Visitor implements IVisitor{
  @Override
  public void visit(CommenEmployee commenEmployee) {
    System.out.println(this.getCommenEmployee(commenEmployee));
  }

  @Override
  public void visit(Manager manager) {
    System.out.println(getManagerInfo(manager));
  }

  private String getBasicInfo(Employee employee){
    String info = "姓名===============>"+employee.getName()+'\n';
    info+="性别===============>"+employee.getSex()+'\n';
    info+="薪水===============>"+employee.getSalary()+'\n';
    info+=employee.getOtherInfo()+'\n';
//    System.out.println("************************************************");
    return info;
  }

  private String getCommenEmployee(CommenEmployee commenEmployee){
    String info = "姓名===============>"+commenEmployee.getName()+'\n';
    info+="性别===============>"+commenEmployee.getSex()+'\n';
    info+="薪水===============>"+commenEmployee.getSalary()+'\n';
    info+=commenEmployee.getOtherInfo()+'\n';
//    System.out.println("************************************************");
    return info;
  }

  private String getManagerInfo(Manager manager){
    String info = "姓名===============>"+manager.getName()+'\n';
    info+="性别===============>"+manager.getSex()+'\n';
    info+="薪水===============>"+manager.getSalary()+'\n';
    info+=manager.getOtherInfo()+'\n';
//    System.out.println("************************************************");
    return info;

  }
}
