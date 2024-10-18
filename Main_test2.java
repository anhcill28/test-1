// Main.java
public class Main_test2 {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        Payment creditCardPayment = new CreditCardPayment();
        paymentProcessor.makePayment(creditCardPayment, 150.00);

        Payment payPalPayment = new PayPalPayment();
        paymentProcessor.makePayment(payPalPayment, 75.50);

        Payment bankTransferPayment = new BankTransferPayment();
        paymentProcessor.makePayment(bankTransferPayment, 200.00);
    }
}

