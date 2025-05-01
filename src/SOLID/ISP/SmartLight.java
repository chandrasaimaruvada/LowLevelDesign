package SOLID.ISP;

public class SmartLight implements Switchable{
    @Override
    public void turnOff() {
        System.out.println("Turn off the Light");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the Light");
    }
}
