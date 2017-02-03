package pl.hornunge.creational.builder.car.builder;

import com.google.common.collect.Lists;
import pl.hornunge.creational.builder.car.Car;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class BigTruckBuilder implements CarBuilder {

    private String body;
    private String engine;
    private List<String> tires;

    @Override
    public CarBuilder addBody() {
        this.body = "Big truck body";
        return this;
    }

    @Override
    public CarBuilder addEngine() {
        this.engine = "Big diesel engine";
        return this;
    }

    @Override
    public CarBuilder addTires() {
        this.tires = Lists.newArrayList("Tire", "Tire", "Tire", "Tire", "Tire", "Tire");
        return this;
    }

    @Override
    public Car build() {
        checkNotNull(body, "Can't build car without a body.");
        checkNotNull(engine, "Can't build car without an engine.");
        checkNotNull(body, "Can't build car without tires.");

        return new Car(body, engine, tires);
    }

}
