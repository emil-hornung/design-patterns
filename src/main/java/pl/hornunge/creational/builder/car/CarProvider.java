package pl.hornunge.creational.builder.car;

import pl.hornunge.creational.builder.car.builder.CarBuilder;

public class CarProvider {
    private final CarBuilder carBuilder;

    public CarProvider(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car createCar(){
        return carBuilder
                .addBody()
                .addEngine()
                .addTires()
                .build();
    }
}
