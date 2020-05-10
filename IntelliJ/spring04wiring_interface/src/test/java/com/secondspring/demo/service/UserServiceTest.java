package com.secondspring.demo.service;


import com.secondspring.demo.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

//    @Autowired
//    @Qualifier("userServiceFestival")
    @Resource(name="userServiceImpl")
    private UserService userService;
    @Test
    public void testAdd(){
        userService.add();
    }
}
