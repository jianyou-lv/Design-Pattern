package com.ljy.controller;

import com.ljy.mapper.UserMapper;
import com.ljy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserMapper userMapper;

  @ResponseBody
  @GetMapping(value = "/findAll",produces = "text/html;charset=UTF-8")
  public String getAll(){
    List<User> all = userMapper.findAll();
    return all.get(0).getName();
  }
}
