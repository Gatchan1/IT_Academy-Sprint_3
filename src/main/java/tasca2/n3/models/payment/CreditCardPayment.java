package tasca2.n3.models.payment;

public class CreditCardPayment implements PaymentMethod {
    private String ownerName;
    private String cardNumber;
    private String expirationDate;
    private int CVV;

    public CreditCardPayment(String ownerName, String cardNumber, String expirationDate, int CVV) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
    }

    @Override
    public void pay() {
        System.out.println("Payment done via Credit Card");
    }
}
