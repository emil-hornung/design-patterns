package pl.hornunge.creational.factory_method.pizza.factory;

import pl.hornunge.creational.factory_method.pizza.Margherita;
import pl.hornunge.creational.factory_method.pizza.Pepperoni;
import pl.hornunge.creational.factory_method.pizza.Pizza;

public class DefaultPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizzaByName(String name) {
        switch (name){
            case "Margherita":
                return new Margherita();
            case "Pepperoni":
                return  new Pepperoni();
            default:
                throw new IllegalArgumentException("Can't create pizza named " + name);
        }
    }
}
