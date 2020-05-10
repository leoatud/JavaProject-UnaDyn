package com.secondspring.demo.config;

import com.secondspring.demo.dao.UserDao;
import com.secondspring.demo.service.UserService;
import com.secondspring.demo.web.UserController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = {UserController.class, UserDao.class, UserService.class})
public class AppConfig {
}
