package tasca2.n1.builders;

import tasca2.n1.Dough;
import tasca2.n1.Pizza;
import tasca2.n1.Size;

public class MasterPizzaBuilder implements PizzaBuilder {
    private final Pizza pizza;

    public MasterPizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public MasterPizzaBuilder setSize(Size size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public MasterPizzaBuilder setDough(Dough dough) {
        pizza.setDough(dough);
        return this;
    }

    @Override
    public MasterPizzaBuilder addTopping(String topping) {
        pizza.addTopping(topping);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}
