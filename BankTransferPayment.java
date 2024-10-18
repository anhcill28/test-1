// BankTransferPayment.java
final class BankTransferPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of: " + amount);
    }
}
