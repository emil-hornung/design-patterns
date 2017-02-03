package pl.hornunge.structural.bridge.example1.shape;

import pl.hornunge.structural.bridge.example1.drawing.Drawing;

public class Circle extends Shape {
    private final double x;
    private final double y;
    private final double r;

    public Circle(Drawing drawing, double x, double y, double r) {
        super(drawing);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void draw() {
        drawCircle(x,y,r);
    }
}
