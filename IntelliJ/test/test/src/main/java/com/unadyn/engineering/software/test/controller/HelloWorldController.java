package com.unadyn.engineering.software.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //均以 json格式输出，没有jackson配置了

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/quit")
    public String quitJob(){
        return "I am quitting job...";
    }


}
