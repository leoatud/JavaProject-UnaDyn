package com.unadyn.engineering.software.test.controller;

import com.unadyn.engineering.software.test.dao.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/getUser")
    public User getUser(){

        User user =  new User();
        user.setUserName("chen liu");
        user.setPassWord("aaa");
        return user;

    }

}
