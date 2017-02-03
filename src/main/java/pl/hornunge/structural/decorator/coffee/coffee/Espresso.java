package pl.hornunge.structural.decorator.coffee.coffee;

public class Espresso implements Coffee {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
