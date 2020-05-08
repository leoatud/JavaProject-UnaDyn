package hello;

/**
 *
 */
public class MessagePrinter {

    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter...");
    }

    private MessageService service;

    public MessageService getService() {
        return service;
    }

    /**
     * set up relationships with service
     *
     * @param service
     */
    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());

    }
}
