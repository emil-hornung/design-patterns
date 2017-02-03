package pl.hornunge.structural.bridge.example2.shape;

import pl.hornunge.structural.bridge.example2.graphic_interface.GraphicInterface;

public class Rectangle extends Shape{
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw(GraphicInterface graphicInterface) {
        graphicInterface.drawLine(x1,y1,x2,y1);
        graphicInterface.drawLine(x2,y1,x2,y2);
        graphicInterface.drawLine(x2,y2,x1,y2);
        graphicInterface.drawLine(x1,y2,x1,y1);
    }
}
