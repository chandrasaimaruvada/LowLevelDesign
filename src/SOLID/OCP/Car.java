package SOLID.OCP;

public class Car implements VehiclePremiumStrategy{
    @Override
    public void calculatePremium() {
        System.out.println("Car Premium: ₹5000");
    }
}
