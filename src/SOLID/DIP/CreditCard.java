package SOLID.DIP;

public class CreditCard implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Pay Using Credit card : " +amount);
    }
}
