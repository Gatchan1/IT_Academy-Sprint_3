package tasca2.n1.builders;

import tasca2.n1.Dough;
import tasca2.n1.Pizza;
import tasca2.n1.Size;

import java.util.ArrayList;
import java.util.List;

public class PizzaVegetarianBuilder implements PizzaBuilder {
    private final Pizza pizza;
    private final List<String> toppings = new ArrayList<String>(List.of("tomate", "pimiento", "cebolla", "berenjena", "champiñón"));

    public PizzaVegetarianBuilder() {
        pizza = new Pizza();
    }

    @Override
    public PizzaVegetarianBuilder setSize(Size size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaVegetarianBuilder setDough(Dough dough) {
        pizza.setDough(dough);
        return this;
    }

    @Override
    public PizzaVegetarianBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        pizza.setToppings(toppings);
        return pizza;
    }
}
