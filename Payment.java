// Payment.java
// Payment.java
public abstract sealed class Payment permits CreditCardPayment, PayPalPayment, BankTransferPayment {
    public abstract void processPayment(double amount);
}
