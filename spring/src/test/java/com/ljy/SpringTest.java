package com.ljy;

import com.ljy.aop.TestAOP;
import com.ljy.config.MyConfigg;
import com.ljy.loopDependcy.A;
import com.ljy.loopDependcy.B;
import com.ljy.pojo.User;
import com.ljy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= MyConfigg.class)
public class SpringTest {
//
  @Autowired
  private TestAOP testAOP;
  @Autowired
  private A a;
  @Autowired
  private B b;
//  @Autowired
//  private User user;
  @Autowired
  private UserService userService;
  @Test
  public void test(){
    System.out.println(a);
    System.out.println(b);
  }
  @Test
  public void test2(){
     userService.findAll(1,2,3);
  }
}
