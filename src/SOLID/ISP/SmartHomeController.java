package SOLID.ISP;

public class SmartHomeController {

    public void activateSwitch(Switchable device){
        device.turnOn();
    }

    public void deactivateSwitch(Switchable device) {
        device.turnOff();
    }

    public void startRecording(Recordable device) {
        device.recordVideo();
    }

    public void setTemperature(TemperatureControllable device) {
        device.setTemperature();
    }
}
