package com.springmvc.controller;

import com.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test1")
    public String test1(Integer id){
        System.out.println("hello " + id);
        return "view/hello";
    }

    @RequestMapping("/test3")
    public String test3(User user){
        System.out.println(user);
        return "view/hello";
    }

    @RequestMapping("/test4")
    public String test4(String[] cat){
        for (String s : cat) {
            System.out.println(s);
        }
        return "view/hello";
    }
}
