package pl.hornunge.creational.builder.car;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Car {
    private final String body;
    private final String engine;
    private final List<String> tires;

    public Car(String body, String engine, List<String> tires) {
        this.body = body;
        this.engine = engine;
        this.tires = new ArrayList<>(tires);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("body = " + body)
                .add("engine = " + engine)
                .add("tires = " + tires).toString();
    }
}
