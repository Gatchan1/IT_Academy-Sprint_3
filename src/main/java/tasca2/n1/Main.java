package tasca2.n1;

import tasca2.n1.builders.MasterPizzaBuilder;
import tasca2.n1.builders.PizzaHawaianBuilder;
import tasca2.n1.builders.PizzaVegetarianBuilder;

public class Main {
    public static void main(String[] args) {
        Pizza hawaianPizza = new PizzaHawaianBuilder()
                .setSize(Size.SMALL)
                .setDough(Dough.NORMAL)
                .build();
        System.out.println("hawaianPizza: " + hawaianPizza);

        Pizza vegetarianPizzaModified = new PizzaVegetarianBuilder()
                .setSize(Size.SMALL)
                .setDough(Dough.NORMAL)
                .addTopping("queso")
                .build();
        System.out.println("vegetarianPizzaModified: " + vegetarianPizzaModified);

        Pizza randomPizza = new MasterPizzaBuilder()
                .setSize(Size.LARGE)
                .setDough(Dough.GLUTEN_FREE)
                .addTopping("tomate").addTopping("coliflor").addTopping("bacon")
                .build();
        System.out.println("randomPizza: " + randomPizza);
    }
}