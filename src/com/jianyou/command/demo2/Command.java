package com.jianyou.command.demo2;

import com.jianyou.command.demo1.CodeGroup;
import com.jianyou.command.demo1.PageGroup;
import com.jianyou.command.demo1.RequirementGroup;

public abstract class Command {

  //把三个组都定义好，子类可以直接使用
  protected RequirementGroup rg = new RequirementGroup();
  protected PageGroup pg = new PageGroup();
  protected CodeGroup cg = new CodeGroup();

  public abstract void execute();

}
