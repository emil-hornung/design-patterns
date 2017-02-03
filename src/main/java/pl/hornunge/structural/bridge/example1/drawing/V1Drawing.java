package pl.hornunge.structural.bridge.example1.drawing;

import pl.hornunge.structural.bridge.example1.drawing_program.DrawingProgram1;

public class V1Drawing implements Drawing {

    public void drawLine(double x1, double y1, double x2, double y2) {
        DrawingProgram1.drawALine(x1,y1,x2,y2);
    }

    public void drawCircle(double x, double y, double r) {
        DrawingProgram1.drawACircle(x,y,r);
    }
}
