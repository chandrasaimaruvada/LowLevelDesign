package SOLID.OCP;

public class Main {
    public static void main(String[] args) {
        VehiclePremiumService vehiclePremiumService = new VehiclePremiumService();
        vehiclePremiumService.calculateVehiclePremium(new Bike());
        vehiclePremiumService.calculateVehiclePremium(new Car());
        vehiclePremiumService.calculateVehiclePremium(new Truck());
        vehiclePremiumService.calculateVehiclePremium(new Plane());


    }
}
