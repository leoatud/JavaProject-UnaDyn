package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


public class ApplicationTest {


    @Test
    public void testPlayer(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CdPlayer player = context.getBean(CdPlayer.class);

        player.play();
    }
}
