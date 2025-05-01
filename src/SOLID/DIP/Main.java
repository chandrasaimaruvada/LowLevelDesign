package SOLID.DIP;

public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PayPal();
        CheckoutService checkoutService = new CheckoutService(paymentMethod);
        checkoutService.checkOut(2500.00);

    }
}
