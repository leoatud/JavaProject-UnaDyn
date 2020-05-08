package hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring {


    public static void main(String[] args) {

        System.out.println("Main method running");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Service service = (Service)context.getBean("service");

        MessagePrinter printer = context.getBean(MessagePrinter.class);


        printer.printMessage();

        // init Spring container



    }
}
