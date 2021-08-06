package com.ljy.mapper;

import com.ljy.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

 // @Select("select * from user")
  List<User> findAll();
}
