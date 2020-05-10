package com.secondspring.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class NotepadTest {



    @Autowired
    private Person p2;
    @Test
    public void testPad(){

        System.out.println(p2);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.secondspring.demo");
//        Notepad n1 = (Notepad)context.getBean(Notepad.class);
//        Notepad n2 = (Notepad)context.getBean(Notepad.class);
//
//        System.out.println(n1==n2 );
//
//        context.destroy();
//        context.close();

    }


}
