package tasca2.n1;

import tasca2.n1.builders.MasterPizza;
import tasca2.n1.builders.PizzaHawaianBuilder;
import tasca2.n1.builders.PizzaVegetarianBuilder;

public class Main {
    public static void main(String[] args) {
        Pizza hawaianPizza = new PizzaHawaianBuilder()
                .setSize(Size.SMALL)
                .setDough(Dough.NORMAL)
                .build();
        System.out.println("hawaian Pizza: " + hawaianPizza);

        Pizza vegetarianPizzaModified = new PizzaVegetarianBuilder()
                .setSize(Size.SMALL)
                .setDough(Dough.NORMAL)
                .addTopping("queso")
                .build();
        System.out.println("vegetarian Pizza Modified: " + vegetarianPizzaModified);

        PizzaHawaianBuilder hawaianBuilder = new PizzaHawaianBuilder();
        Pizza standardHawaian = new MasterPizza<>(hawaianBuilder).build();
        System.out.println("standard Hawaian pizza: " + standardHawaian);

        PizzaVegetarianBuilder vegetarianBuilder = new PizzaVegetarianBuilder();
        Pizza standardVegetarian = new MasterPizza<>(vegetarianBuilder).build();
        System.out.println("standard Vegetarian pizza: " + standardVegetarian);
    }
}