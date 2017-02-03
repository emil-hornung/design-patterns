package pl.hornunge.creational.factory_method;

import pl.hornunge.creational.factory_method.pizza.Pizza;
import pl.hornunge.creational.factory_method.pizza.factory.DefaultPizzaFactory;
import pl.hornunge.creational.factory_method.pizza.factory.PizzaFactory;

import java.util.stream.Stream;

public class FactoryMethodExample {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new DefaultPizzaFactory();

        Pizza pizza1 = pizzaFactory.createPizzaByName("Margherita");
        Pizza pizza2 = pizzaFactory.createPizzaByName("Pepperoni");

        Stream.of(pizza1, pizza2)
                .forEach(System.out::println);
    }
}
