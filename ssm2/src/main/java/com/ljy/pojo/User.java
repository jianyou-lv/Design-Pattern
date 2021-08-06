package com.ljy.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class User implements Serializable {
  private int id;
  private String name;
  private int age;
  private String description;

}
