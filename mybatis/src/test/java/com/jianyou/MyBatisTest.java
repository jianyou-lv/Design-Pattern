package com.jianyou;


import com.jianyou.mapper.UserMapper;
import com.jianyou.pojo.vo.UserVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.jianyou.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyBatisTest {

  public UserMapper common() throws IOException {
    InputStream is = Resources.getResourceAsStream("mybatis.xml");
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
    SqlSession sqlSession = factory.openSession();

    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    return mapper;
  }

    @Test
    public void test1() throws IOException {
      UserMapper mapper = common();
      List<User> allUser = mapper.findAllUser();
      for (User user : allUser) {
        System.out.println(user);
      }
    }

  @Test
  public void test2() throws IOException {
    UserMapper mapper = common();
    UserVo userVo = new UserVo();
    userVo.setAge(21);
    userVo.setName("吕建友");
    List<User> userByCondition = mapper.findUserByCondition(userVo);
    for (User user : userByCondition) {
      System.out.println(user);
    }
  }

  @Test
  public void test3() throws IOException {
    UserMapper mapper = common();
    UserVo userVo = new UserVo();
    userVo.setAge(10);
//    userVo.setName("'吕%'");
    List<User> userByCondition = mapper.findUserByChoose(userVo);
    for (User user : userByCondition) {
      System.out.println(user);
    }
  }

  @Test
  public void test4() throws IOException {
    UserMapper mapper = common();
    UserVo userVo = new UserVo();
    userVo.setAge(10);
//    userVo.setName("'吕%'");
    List<User> userByCondition = mapper.findUserSecond(userVo);
    for (User user : userByCondition) {
      System.out.println(user);
    }
  }

  @Test
  public void test5() throws IOException {
    UserMapper mapper = common();
    UserVo userVo = new UserVo();
    List<Integer> list = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
    List<Integer> list2 = Stream.of(1, 2, 4, 5).collect(Collectors.toList());
    List<User> userByCondition = mapper.findUserByIds(list);

    for (User user : userByCondition) {
      System.out.println(user);
    }
    System.out.println("===============================================");
    List<User> userByIds = mapper.findUserByIds(list);
    for (User userById : userByIds) {
      System.out.println(userById);
    }

    System.out.println("===================二级缓存测试================");
    test4();
  }



}
