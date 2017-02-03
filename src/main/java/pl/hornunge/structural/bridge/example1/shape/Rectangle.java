package pl.hornunge.structural.bridge.example1.shape;

import pl.hornunge.structural.bridge.example1.drawing.Drawing;

public class Rectangle extends Shape {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;

    public Rectangle(Drawing drawing, double x1, double y1, double x2, double y2) {
        super(drawing);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        drawLine(x1,y1,x1,y2);
        drawLine(x1,y2,x2,y2);
        drawLine(x2,y2,x1,y2);
        drawLine(x1,y2,x1,y1);
    }
}
