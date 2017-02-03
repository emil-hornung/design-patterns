package pl.hornunge.structural.decorator.coffee.condiment;

import pl.hornunge.structural.decorator.coffee.coffee.Coffee;

public abstract class CoffeeDecorator implements Coffee {

    private final Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
