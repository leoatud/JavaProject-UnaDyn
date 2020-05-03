package com.unadyn.engineering.software.test.dao.impl;

import com.unadyn.engineering.software.test.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("get user information from MySql");
    }
}
