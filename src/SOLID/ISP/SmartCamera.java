package SOLID.ISP;

public class SmartCamera implements Switchable, Recordable{
    @Override
    public void recordVideo() {
        System.out.println("Start Recording");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the recording");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the recording");
    }
}
