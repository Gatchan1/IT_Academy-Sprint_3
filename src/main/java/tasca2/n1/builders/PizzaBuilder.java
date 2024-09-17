package tasca2.n1.builders;

import tasca2.n1.Dough;
import tasca2.n1.Pizza;
import tasca2.n1.Size;

public interface PizzaBuilder {
    PizzaBuilder setSize(Size size);
    PizzaBuilder setDough(Dough dough);
    PizzaBuilder addTopping(String topping);
    Pizza build();
}
