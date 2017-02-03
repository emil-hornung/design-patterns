package pl.hornunge.structural.decorator.coffee.condiment;

import pl.hornunge.structural.decorator.coffee.coffee.Coffee;

public class WithSugar extends CoffeeDecorator {
    public WithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}
