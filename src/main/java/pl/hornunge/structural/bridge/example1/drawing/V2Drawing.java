package pl.hornunge.structural.bridge.example1.drawing;

import pl.hornunge.structural.bridge.example1.drawing_program.DrawingProgram2;

public class V2Drawing implements Drawing {
    public void drawLine(double x1, double y1, double x2, double y2) {
        DrawingProgram2.drawLine(x1,x2,y1,y2);
    }

    public void drawCircle(double x, double y, double r) {
        DrawingProgram2.drawCircle(r,x,y);
    }
}
