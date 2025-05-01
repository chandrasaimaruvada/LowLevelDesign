package SOLID.ISP;

public class Main {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight();
        SmartCamera camera = new SmartCamera();
        SmartThermostat thermostat = new SmartThermostat();
        SmartSpeaker smartSpeaker = new SmartSpeaker();

        SmartHomeController homeController = new SmartHomeController();

        homeController.activateSwitch(smartLight);
        homeController.activateSwitch(camera);
        homeController.activateSwitch(thermostat);
        smartSpeaker.play();

        homeController.setTemperature(thermostat);
        homeController.startRecording(camera);

    }
}
