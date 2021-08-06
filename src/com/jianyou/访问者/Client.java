package com.jianyou.访问者;

import java.util.ArrayList;
import java.util.List;

public class Client {

  public static void main(String[] args) {
   List<Employee>  employees = mockEmployee();
    for (Employee employee : employees) {
      employee.accept(new Visitor());
    }
  }

  private static List<Employee> mockEmployee() {
    List<Employee> list = new ArrayList<>();
    //产生张三这个员工
    CommenEmployee zhangsan = new CommenEmployee();
    zhangsan.setJob("编写Java程序，绝对的蓝领，苦工加搬运工");
    zhangsan.setName("张三");
    zhangsan.setSalary(1800);
    zhangsan.setSex(Employee.MALE);
    list.add(zhangsan);

    CommenEmployee lisi = new CommenEmployee();
    lisi.setJob("页面美工，审美素质太不行了！");
    lisi.setName("李四");
    lisi.setSalary(1900);
    lisi.setSex(Employee.FEMALE);
    list.add(lisi);

    //再产生一个经理
    Manager manager = new Manager();
    manager.setName("王五");
    manager.setSex(Employee.MALE);
    manager.setPerformance("基本上是负值，但是我会拍马屁呀");
    manager.setSalary(18750);
    list.add(manager);

    return list;



  }
}
