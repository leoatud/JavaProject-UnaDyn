package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
public class ApplicationSpring {

    public ApplicationSpring() {
        System.out.println("this is main class...");
    }

    public static void main(String[] args) {


        // init Spring container
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);

        MessagePrinter printer = context.getBean(MessagePrinter.class);

        printer.printMessage();

    }
}
