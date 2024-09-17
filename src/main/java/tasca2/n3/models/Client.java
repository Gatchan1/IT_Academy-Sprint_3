package tasca2.n3.models;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Shoe> shoppingCart = new ArrayList<Shoe>();
    private List<Shoe> boughtShoes = new ArrayList<Shoe>();

    public Client() {

    }

    public List<Shoe> getShoppingCart() {
        return shoppingCart;
    }

    public void isShoppingCartEmpty() {
        if (shoppingCart.isEmpty()) {
            System.out.println("Shopping cart is empty.");
        } else {
            System.out.println("Shopping cart contains some items.");
        }
    }

    public List<Shoe> getBoughtShoes() {
        return boughtShoes;
    }

    public void addToShoppingCart(Shoe shoe) {
        shoppingCart.add(shoe);
    }

    public void buyItemsInShoppingCart() {
        shoppingCart.forEach(Shoe::sellOne);
        boughtShoes = shoppingCart;
        shoppingCart = new ArrayList<Shoe>();
    }
}
