package com.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
public class IndexController {


    @ResponseBody
    @RequestMapping("/")
    public String first(){
        return "hello this is first springboot";
    }


    public static void main(String[] args) {
        SpringApplication.run(IndexController.class, args);
    }
}
