package com.jianyou.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Order {
  private int id;
  private Integer userId;
  private String number;
  private Date createTime;
  private String note;

  private User user;  //一个订单只能有一个用户下单
}
