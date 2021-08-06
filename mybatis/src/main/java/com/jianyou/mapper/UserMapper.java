package com.jianyou.mapper;

import com.jianyou.pojo.vo.UserVo;
import org.apache.ibatis.annotations.Select;
import com.jianyou.pojo.User;

import java.util.List;

public interface UserMapper {

 // @Select("select * from user")
  List<User> findAllUser();


  List<User> findUserByCondition(UserVo uservo);

  List<User> findUserByChoose(UserVo userVo);

  List<User> findUserSecond(UserVo userVo);

  List<User> findUserByIds(List<Integer> ids);
}
