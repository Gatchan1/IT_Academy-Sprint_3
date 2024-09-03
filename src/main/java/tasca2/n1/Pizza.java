package tasca2.n1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private Size size;
    private Dough dough;
    private List<String> toppings;

    public Pizza() {
        toppings = new ArrayList<String>();
    }

    public Size getSize() {
        return size;
    }

    public Dough getDough() {
        return dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", dough=" + dough +
                ", toppings=" + toppings +
                '}';
    }
}
