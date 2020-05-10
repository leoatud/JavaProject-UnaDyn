package hello;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessageService... ");
    }

    /**
     *
     * @return
     */
    public String getMessage(){
        return "hello world";
    }
}
