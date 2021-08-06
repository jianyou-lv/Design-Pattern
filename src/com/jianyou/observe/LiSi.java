package com.jianyou.observe;

public class LiSi implements ILise{
  @Override
  public void update(String str) {
    System.out.println("李斯：观察到韩非子活动了，开始向老板汇报....");
    this.reportToQinshihuang(str);
    System.out.println("李斯：汇报完毕！");
  }

  private void reportToQinshihuang(String str) {
    System.out.println("李斯：报告老板！韩非子有活动了！============="+str);
  }
}
