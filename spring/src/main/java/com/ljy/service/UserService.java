package com.ljy.service;

import com.ljy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class UserService {


  public void findAll(int a,int b,int c){
    System.out.println("查询所有用户...........");

  }
}
