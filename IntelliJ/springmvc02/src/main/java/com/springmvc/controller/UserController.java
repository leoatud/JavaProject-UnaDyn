package com.springmvc.controller;

import com.springmvc.exception.LoginException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/login")
    public String login_page(){
        System.out.println("user/login");
        return "login";
    }

    @RequestMapping("/test1")
    public String test1(){
        if(true){
            throw new LoginException("testttttttt");
        }
        return "index";
    }
}
