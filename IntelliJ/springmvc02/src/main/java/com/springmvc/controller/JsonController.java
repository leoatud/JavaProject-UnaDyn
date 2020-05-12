package com.springmvc.controller;


import com.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/test1")
    public User test1(){
        System.out.println("json/test1");
        return new User(1,"chen", true);
    }

    @RequestMapping("/test3")
    public User test3(@RequestBody User user){
        System.out.println("json/test3");
        return new User(2, "caicai", false);
    }

}
