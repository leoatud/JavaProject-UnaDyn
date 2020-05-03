package com.unadyn.engineering.software.test.test;

import com.unadyn.engineering.software.test.dao.impl.UserDaoMysqlImpl;
import com.unadyn.engineering.software.test.dao.impl.UserDaoOracleImpl;
import com.unadyn.engineering.software.test.service.service.impl.UserServiceImpl;

public class UserDaoTest {
    public static void main(String[] args) {
        //原本应用程序创建不同的类，现在交给client自己创建-->IOC
        //不需要担心具体的实现，程序本身不需要管，只需要提供接口即可
        //service layer  / dao layer --> separate --> 没有直接依赖关系


        // beans.xml: bean factory, create beans

        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();

        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
