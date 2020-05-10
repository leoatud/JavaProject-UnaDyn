package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer {

    @Autowired(required=false)
    private CompactDisc cd;
    @Autowired
    private Power ppower;


    public CdPlayer() {
        System.out.println("CdPlayer constyuroctr...");
    }

    @Autowired
    public void maunalSetter(){
        System.out.println("hahahahahahaha");
    }

//    @Autowired
//    public CdPlayer(CompactDisc cd) {
//        this.cd = cd;
//        System.out.println("CdPlayer construcytor with cd ...");
//    }

//    @Autowired
//    public CdPlayer(CompactDisc cd, Power ppower) {
//        this.cd = cd;
//        this.ppower = ppower;
//    }

    public void play(){
       // cd.play();
        ppower.supply();
    }


}
