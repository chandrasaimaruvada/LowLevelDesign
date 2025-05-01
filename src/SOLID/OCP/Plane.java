package SOLID.OCP;

public class Plane implements VehiclePremiumStrategy{
    @Override
    public void calculatePremium() {
        System.out.println("Plane Premium: ₹19000");
    }
}
