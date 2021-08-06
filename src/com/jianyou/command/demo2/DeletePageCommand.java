package com.jianyou.command.demo2;

public class DeletePageCommand extends Command{
  @Override
  public void execute() {
     super.pg.find();
     super.pg.delete();
     super.pg.plan();
  }
}
