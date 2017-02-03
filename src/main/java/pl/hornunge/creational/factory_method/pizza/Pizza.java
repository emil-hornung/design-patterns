package pl.hornunge.creational.factory_method.pizza;

import java.util.StringJoiner;

abstract public class Pizza {

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .toString();
    }
}
