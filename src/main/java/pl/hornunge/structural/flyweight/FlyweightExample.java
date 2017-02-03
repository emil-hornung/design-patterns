package pl.hornunge.structural.flyweight;

import pl.hornunge.structural.flyweight.car.Car;

public class FlyweightExample {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car("Toyota"), new Car("Toyota"),
                new Car("Mercedes"), new Car("Mercedes"), new Car("Mercedes"),
        };
        //please note that Toyota and Mercedes will be created only once - this is our profit
        cars[0].move(1,1);
        cars[1].move(2,2);
        cars[2].move(3,3);
        cars[3].move(4,4);
        cars[4].move(5,5);

        cars[0].move(10,10);
        cars[1].move(20,20);
        cars[2].move(30,30);
        cars[3].move(40,40);
        cars[4].move(50,50);
        //please note that the current position (which is an extrinsic state) is correctly stored in Car object
    }
}
