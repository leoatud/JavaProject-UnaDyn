package com.unadyn.engineering.software.test.dao.impl;

import com.unadyn.engineering.software.test.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("getUser from Oracle dao");
    }
}
