package soundsystem;

import org.springframework.stereotype.Component;

//@Component
public class CompactDisc {
    public CompactDisc() {
        System.out.println("CompactDisc Constortuctor...");
    }

    public void play() {
        System.out.println("playing music...");
    }
}
