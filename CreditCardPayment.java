// CreditCardPayment.java
final class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of: " + amount);
    }
}