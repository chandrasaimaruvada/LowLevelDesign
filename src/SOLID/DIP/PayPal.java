package SOLID.DIP;

public class PayPal implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Pay Using Paypal : " + amount);
    }
}
