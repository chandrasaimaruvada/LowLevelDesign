package SOLID.OCP;

public class Bike implements VehiclePremiumStrategy{
    @Override
    public void calculatePremium() {
        System.out.println("Bike Premium: ₹2000");
    }
}
