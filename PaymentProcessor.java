// PaymentProcessor.java
public class PaymentProcessor {
    public void makePayment(Payment paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}