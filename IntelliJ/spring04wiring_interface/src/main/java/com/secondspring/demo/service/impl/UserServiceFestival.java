package com.secondspring.demo.service.impl;

import com.secondspring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceFestival implements UserService {
    public void add() {
        System.out.println("add from festival");
    }
}
