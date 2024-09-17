package tasca2.n3.models.payment;

public class BankPayment implements PaymentMethod {
    private int accountNumber;
    private String ownerName;

    public BankPayment(int accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    @Override
    public void pay() {
        System.out.println("Payment done via Bank Payment");
    }
}
