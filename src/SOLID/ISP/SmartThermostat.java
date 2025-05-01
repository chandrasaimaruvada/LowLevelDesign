package SOLID.ISP;

public class SmartThermostat implements TemperatureControllable, Switchable{
    @Override
    public void setTemperature() {
        System.out.println("Set The Temperature using remote");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the temperature controllable");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the temperature controllable");
    }
}
