package SOLID.OCP;

public class Truck implements VehiclePremiumStrategy{
    @Override
    public void calculatePremium() {
        System.out.println("Truck Premium: ₹8000");
    }
}
