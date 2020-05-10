package com.secondspring.demo.dao.impl;

import com.secondspring.demo.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("add from userDaoImpl");
    }
}
