package pl.hornunge.structural.flyweight.car;

import pl.hornunge.structural.flyweight.car_flyweight.CarFlyweight;
import pl.hornunge.structural.flyweight.car_flyweight.CarFlyweightFactory;

public class Car {
    private final CarFlyweight carFlyweight;
    private int x = 0;
    private int y = 0;

    public Car(String name) {
        carFlyweight = CarFlyweightFactory.getCarByName(name);
    }

    public void move(int toX, int toY) {
        carFlyweight.move(x, y, toX, toY);
        x = toX;
        y = toY;
    }
}
