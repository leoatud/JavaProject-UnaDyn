/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springfromzero.bean.Hello;
import springfromzero.dao.User;
import springfromzero.factory.UserStaticFactory;
import springfromzero.service.UserService;

/**
 *
 * @author cliu
 */
public class Test {

   public static void main(String[] args) {
      //bean factory help us to create the object
      //bean properties has been setup in bean container
      // =====> IOC 控制的内容：谁来创建对象 （传统都是application创建的）       反转：现在是被动接收，以前是程序自己创建的，权限的转移-->被动接受container创建的对象
      // =====> DI dependency injection: 通过bean factory inject the object
      // IOC是一种思想，以前是主动执行，现在是被动执行
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
      UserService us = (UserService)context.getBean("userService");
      us.add();
      
      
//      User user = (User) context.getBean("user");
//      user.show();
//
//      User user1 = (User) context.getBean("u1");
//      user1.show();
//
//      User user2 = (User) context.getBean("u2");
//      user2.show();
//
//      User user3 = (User) context.getBean("u3");
//      user3.show();

//      UserService us = (UserService)context.getBean("service");
//      us.getUser();
//      Hello hello = (Hello)context.getBean("hello");
//      hello.show();
//      
//      hello = (Hello)context.getBean("hello2");
//      hello.show();
//      Hello student = (Hello)context.getBean("student");
//      student.show();
//      
//      User user = (User)context.getBean("user");
//      user.show();
//      
//      User user1=(User)context.getBean("user1");
//      user1.show();
   }
}
