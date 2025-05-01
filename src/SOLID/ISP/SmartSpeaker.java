package SOLID.ISP;

public class SmartSpeaker implements Playable{
    @Override
    public void play() {
        System.out.println("Play Music");
    }
}
