package pl.hornunge.structural.decorator.coffee.condiment;

import pl.hornunge.structural.decorator.coffee.coffee.Coffee;

public class WithMilk extends CoffeeDecorator {

    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return  super.getDescription() + " + milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
