import com.secondspring.demo.soundsystem.CompactDisc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationString {
    public static void main(String[] args) {
        System.out.println("Application is running");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");



    }
}
