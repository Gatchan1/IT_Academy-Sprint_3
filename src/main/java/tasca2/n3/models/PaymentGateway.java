package tasca2.n3.models;

import tasca2.n3.models.payment.PaymentMethod;

public class PaymentGateway<T extends PaymentMethod> {
    private final T paymentMethod;
    private final Client client;

    public PaymentGateway(Client client, T paymentMethod) {
        this.client = client;
        this.paymentMethod = paymentMethod;
    }

    public void executePay() {
        System.out.println("Payment is being done");
        client.buyItemsInShoppingCart();
        paymentMethod.pay();
    }
}
