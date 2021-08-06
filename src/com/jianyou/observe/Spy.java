package com.jianyou.observe;

public class Spy extends Thread{
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    //通过构造函数来传递参数，我要监控谁，谁来监控，要监控什么？
    public Spy(HanFeiZi hanFeiZi,LiSi liSi,String type){
      this.hanFeiZi = hanFeiZi;
      this.liSi = liSi;
      this.type = type;
    }

  @Override
  public void run() {
      while(true){
        if(this.type.equals("breakfast")){
          if(this.hanFeiZi.isHavingBreakFast()){
            this.liSi.update("韩非子在吃饭");
            //重置状态，继续监控
            this.hanFeiZi.setHavingBreakFast(false);
          }
        }else{
            if(this.hanFeiZi.isHavingFun()){
              this.liSi.update("韩非子在娱乐");
              this.hanFeiZi.setHavingFun(false);
            }
        }



      }

  }
}
