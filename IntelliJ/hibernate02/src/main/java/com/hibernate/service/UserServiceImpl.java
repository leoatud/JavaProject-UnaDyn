package com.hibernate.service;


import com.hibernate.dao.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void add() {
        userDao.addUser();
    }
}
