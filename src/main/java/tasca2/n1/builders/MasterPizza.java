package tasca2.n1.builders;

import tasca2.n1.Dough;
import tasca2.n1.Pizza;
import tasca2.n1.Size;

public class MasterPizza<T extends PizzaBuilder> {
    private final T pizzaBuilder;

    public MasterPizza(T pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza build() {
        return pizzaBuilder.setSize(Size.MEDIUM)
                .setDough(Dough.NORMAL)
                .build();
    }
}
