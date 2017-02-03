package pl.hornunge.structural.decorator.coffee.coffee;

public class HouseBlendedCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "House blended coffee";
    }

    @Override
    public double getCost() {
        return 7.0;
    }
}
