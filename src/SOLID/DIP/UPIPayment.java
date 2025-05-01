package SOLID.DIP;

public class UPIPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Pay By Using UPI : " + amount);
    }
}
