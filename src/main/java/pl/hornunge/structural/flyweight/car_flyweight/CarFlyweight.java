package pl.hornunge.structural.flyweight.car_flyweight;

public abstract class CarFlyweight {
    private final String name;
    private final int maxSpeed;
    private final int horsePower;

    protected CarFlyweight(String name, int maxSpeed, int horsePower) {
        System.out.println("Creating CarFlyweight with name: " + name);
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
    }

    public void move(int fromX, int fromY, int toX, int toY){
        System.out.println(String.format("Moving %s from (%d, %d) to (%d, %d)", name, fromX, fromY, toX, toY));
    }
}
