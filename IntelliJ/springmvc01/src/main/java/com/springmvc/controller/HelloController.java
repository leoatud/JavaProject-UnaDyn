package com.springmvc.controller;


import com.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test1")
    public String test1(Integer id){
        System.out.println("Hello World..." + id);
        return "view/hello";
    }

    @RequestMapping("/test2")
    public String test2(Integer id, String name){
        System.out.println("Hello world..." + id + " : " + name);
        return "index";
    }

    @RequestMapping("/test3")
    public String test3(User user){
        System.out.println(user);
        return "index";
    }
}
