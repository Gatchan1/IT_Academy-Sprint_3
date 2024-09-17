package tasca2.n1;

import tasca2.n1.builders.MasterPizza;
import tasca2.n1.builders.PizzaHawaiianBuilder;
import tasca2.n1.builders.PizzaVegetarianBuilder;

public class Main {
    public static void main(String[] args) {
        Pizza hawaiianPizza = new PizzaHawaiianBuilder()
                .setSize(Size.SMALL)
                .setDough(Dough.NORMAL)
                .build();
        System.out.println("hawaiian Pizza: " + hawaiianPizza);

        Pizza vegetarianPizzaModified = new PizzaVegetarianBuilder()
                .setSize(Size.SMALL)
                .setDough(Dough.NORMAL)
                .addTopping("queso")
                .build();
        System.out.println("vegetarian Pizza Modified: " + vegetarianPizzaModified);

        PizzaHawaiianBuilder hawaiianBuilder = new PizzaHawaiianBuilder();
        Pizza standardHawaiian = new MasterPizza<>(hawaiianBuilder).build();
        System.out.println("standard Hawaiian pizza: " + standardHawaiian);

        PizzaVegetarianBuilder vegetarianBuilder = new PizzaVegetarianBuilder();
        Pizza standardVegetarian = new MasterPizza<>(vegetarianBuilder).build();
        System.out.println("standard Vegetarian pizza: " + standardVegetarian);
    }
}