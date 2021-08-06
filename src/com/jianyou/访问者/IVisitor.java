package com.jianyou.访问者;

public interface IVisitor {

  //首先，定义我可以访问普通员工
  void visit(CommenEmployee commenEmployee);
 //我可以访问部门经理
  void visit(Manager manager);

}
