package com.secondspring.demo.dao.impl;

import com.secondspring.demo.dao.UserDao;

public class UserDaoCache implements UserDao {
    public void add() {
        System.out.println("user dao cache add...");
    }
}
