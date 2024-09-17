package tasca2.n3;

import tasca2.n3.models.Client;
import tasca2.n3.models.PaymentGateway;
import tasca2.n3.models.Shoe;
import tasca2.n3.models.payment.PaypalPayment;

public class ShoeShop {
    public static void start() {
        Shoe shoe1 = new Shoe("Nike", "sneakers blue", 55.65, 10);
        Shoe shoe2 = new Shoe("Adidas", "sneakers white", 75.20, 15);
        Shoe shoe3 = new Shoe("Camper", "black shoe", 82, 12);

        Client client1 = new Client();
        client1.addToShoppingCart(shoe1);
        client1.addToShoppingCart(shoe2);

        System.out.println("Shopping cart: " + client1.getShoppingCart());

        PaymentGateway<PaypalPayment> payment = new PaymentGateway<>(client1, new PaypalPayment("pedrito@gmail.com", "password78"));
        payment.executePay();

        client1.isShoppingCartEmpty();
    }


}
