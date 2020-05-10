package com.secondspring.demo.service.impl;

import com.secondspring.demo.dao.UserDao;
import com.secondspring.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;


    public UserServiceImpl() {
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }
}
