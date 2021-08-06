package com.jianyou.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {
  private int id;
  private String name;
  private int age;
  private String description;

  private List<Order> orders;

}
