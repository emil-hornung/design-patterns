package pl.hornunge.creational.builder.car.builder;

import pl.hornunge.creational.builder.car.Car;

public interface CarBuilder {
    CarBuilder addBody();
    CarBuilder addEngine();
    CarBuilder addTires();
    Car build();
}
