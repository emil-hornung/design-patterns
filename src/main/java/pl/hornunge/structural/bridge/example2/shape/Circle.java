package pl.hornunge.structural.bridge.example2.shape;

import pl.hornunge.structural.bridge.example2.graphic_interface.GraphicInterface;

public class Circle extends Shape{
    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    public void draw(GraphicInterface graphicInterface) {
        graphicInterface.drawCircle(x,y,radius);
    }
}
