package com.ljy.service;

import com.ljy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

  @Autowired
   private UserMapper userMapper;

  @Transactional
  public void findAll(){

  }
}
