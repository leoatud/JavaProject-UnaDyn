package hello;


public class MessageService implements Service{

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

    public void message() {
        System.out.println("I am from Service interface");
    }
}
