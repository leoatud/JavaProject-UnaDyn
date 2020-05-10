package com.secondspring.demo.config;


import com.secondspring.demo.dao.UserDao;
import com.secondspring.demo.dao.impl.UserDaoCache;
import com.secondspring.demo.dao.impl.UserDaoImpl;
import com.secondspring.demo.service.UserService;
import com.secondspring.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {



    @Bean
    public UserService userServiceImpl(@Qualifier("userDaoImpl") UserDao userDao) {
        System.out.println("Create new userServiceImpl");

//        UserDao userDao = new UserDaoImpl();
        UserServiceImpl userService =new UserServiceImpl();
        userService.setUserDao(userDao);
        return userService;
    }

    @Bean
    public UserDao userDaoImpl() {
        System.out.println("Create new userDaoImp");
        return new UserDaoImpl();
    }

    @Bean
    public UserDao userDaoCache() {
        System.out.println("Create new userDaoCache");
        return new UserDaoCache();
    }
}
