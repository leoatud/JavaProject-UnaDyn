package com.unadyn.engineering.software.test.service.service.impl;

import com.unadyn.engineering.software.test.dao.UserDao;
import com.unadyn.engineering.software.test.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
