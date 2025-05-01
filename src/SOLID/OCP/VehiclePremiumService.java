package SOLID.OCP;

public class VehiclePremiumService {

    public void calculateVehiclePremium(VehiclePremiumStrategy vehiclePremiumStrategy) {
        vehiclePremiumStrategy.calculatePremium();
    }

}
