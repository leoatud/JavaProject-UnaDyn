package com.secondspring.demo.service.impl;

import com.secondspring.demo.dao.UserDao;
import com.secondspring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void add() {
        System.out.println("add user");
    }
}
