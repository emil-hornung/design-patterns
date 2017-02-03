package pl.hornunge.structural.decorator.coffee;

import pl.hornunge.structural.decorator.coffee.coffee.Coffee;
import pl.hornunge.structural.decorator.coffee.coffee.Espresso;
import pl.hornunge.structural.decorator.coffee.coffee.HouseBlendedCoffee;
import pl.hornunge.structural.decorator.coffee.condiment.WithMilk;
import pl.hornunge.structural.decorator.coffee.condiment.WithSugar;

public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        printCoffee(coffee);

        coffee = new WithMilk(new Espresso());
        printCoffee(coffee);

        coffee = new WithSugar(new WithMilk(new Espresso()));
        printCoffee(coffee);

        coffee = new WithMilk(new WithSugar(new Espresso()));
        printCoffee(coffee);

        coffee = new WithMilk(new WithSugar(new WithSugar(new HouseBlendedCoffee())));
        printCoffee(coffee);
    }

    private static void printCoffee(Coffee coffee) {
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());
    }
}
