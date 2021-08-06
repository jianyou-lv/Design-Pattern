package com.ljy.config;

import com.ljy.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.ljy"})
public class MyConfigg {


  //@Bean(name = "user")
  public User getUser() throws InterruptedException {
    System.out.println("开始创建user对象.............");
    User user = new User();
    user.setAge(10);
    user.setName("吕建友");
    System.out.println("创建对象成功..........");
    return user;
  }
}
