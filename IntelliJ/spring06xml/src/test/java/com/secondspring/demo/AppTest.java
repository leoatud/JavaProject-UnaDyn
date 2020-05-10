package com.secondspring.demo;

import com.secondspring.demo.soundsystem.CDPlayer;
import com.secondspring.demo.soundsystem.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {


//    @Autowired
//    private CDPlayer player;
//
//    @Test
//    public void testPlay(){
//        player.play();
//    }

    @Autowired
    private CompactDisc cd1;

    @Test
    public void play(){
        cd1.play();
        cd1.toString();
    }




//    @Autowired
//    private CompactDisc cd;
//
//    @Autowired
//    private CompactDisc cd1;
//
//    @Autowired
//    @Qualifier("cd")
//    private CompactDisc cd3;
//
//    @Test
//    public void testPlay() {
//        cd.play();
//        cd1.play();
//        cd3.play();
//    }
}
