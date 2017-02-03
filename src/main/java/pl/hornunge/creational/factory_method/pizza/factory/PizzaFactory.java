package pl.hornunge.creational.factory_method.pizza.factory;

import pl.hornunge.creational.factory_method.pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizzaByName(String name);
}
