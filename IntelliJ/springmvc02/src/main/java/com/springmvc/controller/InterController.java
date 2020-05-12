package com.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter")
public class InterController {

    @RequestMapping("/test1/a/b")
    public String test1(){
        System.out.println("inter/test1/a/b");
        return "index";
    }

    @RequestMapping("/test2")
    public String test2(){
        System.out.println("inter/test2");
        return "index";
    }
}
