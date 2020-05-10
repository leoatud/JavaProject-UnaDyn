package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class Power {
    public Power() {
    }

    public void supply(){
        System.out.println("power supply");
    }
}
