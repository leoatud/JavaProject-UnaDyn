package com.springmvc.controller;

import com.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rest")
public class RestController {

    @GetMapping("/users")
    public String queryUser() {
        System.out.println("get users");
        return "index";
    }

    @PostMapping("/users")
    public String saveUser(User user) {
        System.out.println("post users");
        return "index";
    }

    @PutMapping("/users")
    public String updateUser(User user) {
        System.out.println("put users");
        return "index";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Integer id) {
        System.out.println("delete user: " + id);
        return "index";
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable Integer id) {
        System.out.println("get user: " + id);
        return "index";
    }


    @GetMapping("/login")
    public String loginPage(){
        System.out.println("login");
        return "index";
    }

    @PostMapping("/login")
    public String loginLogic(){
        System.out.println("logiccccc");
        return "index";
    }
}
