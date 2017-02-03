package pl.hornunge.creational.builder;

import pl.hornunge.creational.builder.car.CarProvider;
import pl.hornunge.creational.builder.car.builder.BigTruckBuilder;
import pl.hornunge.creational.builder.car.builder.PassengerCarBuilder;

public class BuilderExample {

    public static void main(String[] args) {
        CarProvider passengerCarProvider = new CarProvider(new PassengerCarBuilder());
        System.out.println(passengerCarProvider.createCar());

        CarProvider bigTruckProvider = new CarProvider(new BigTruckBuilder());
        System.out.println(bigTruckProvider.createCar());

    }

}
