package pl.hornunge.structural.flyweight.car_flyweight;

import pl.hornunge.structural.flyweight.car_flyweight.CarFlyweight;
import pl.hornunge.structural.flyweight.car_flyweight.Mercedes;
import pl.hornunge.structural.flyweight.car_flyweight.Toyota;

import java.util.HashMap;
import java.util.Map;

public class CarFlyweightFactory {

    private static Map<String, CarFlyweight> carFlyweights = new HashMap<>();

    public static CarFlyweight getCarByName(String name) {
        if (carFlyweights.containsKey(name)){
            return carFlyweights.get(name);
        }

        CarFlyweight carFlyweight;
        switch (name){
            case "Mercedes":
                carFlyweight = new Mercedes();
                break;
            case "Toyota":
                carFlyweight = new Toyota();
                break;
            default:
                throw new IllegalArgumentException("Can't resolve carFlyweight by name: " + name);
        }
        carFlyweights.put(name, carFlyweight);
        return carFlyweight;
    }
}
