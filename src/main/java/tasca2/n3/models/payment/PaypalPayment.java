package tasca2.n3.models.payment;

public class PaypalPayment implements PaymentMethod {
    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay() {
        System.out.println("Payment done via Paypal");
    }
}
