package SOLID.DIP;

public class CheckoutService{

    private final PaymentMethod paymentMethod;

    public CheckoutService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkOut(double amount) {
        System.out.println("Processing checkout...");
        paymentMethod.pay(amount);
    }
}
