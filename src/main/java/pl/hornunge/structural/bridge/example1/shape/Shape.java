package pl.hornunge.structural.bridge.example1.shape;

import pl.hornunge.structural.bridge.example1.drawing.Drawing;

public abstract class Shape {
    private final Drawing drawing;

    protected Shape(Drawing drawing) {
        this.drawing = drawing;
    }

    public abstract void draw();

    protected void drawLine(double x1, double y1, double x2, double y2) {
        drawing.drawLine(x1, y1, x2, y2);
    }

    protected void drawCircle(double x, double y, double r) {
        drawing.drawCircle(x,y,r);
    }
}
