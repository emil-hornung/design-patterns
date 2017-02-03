package pl.hornunge.structural.bridge.example1;

import pl.hornunge.structural.bridge.example1.drawing.V1Drawing;
import pl.hornunge.structural.bridge.example1.drawing.V2Drawing;
import pl.hornunge.structural.bridge.example1.shape.Circle;
import pl.hornunge.structural.bridge.example1.shape.Rectangle;
import pl.hornunge.structural.bridge.example1.shape.Shape;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        V1Drawing v1Drawing = new V1Drawing();
        V2Drawing v2Drawing = new V2Drawing();

        List<Shape> shapesToDraw = Arrays.asList(
            new Circle(v1Drawing,1,2,3),
            new Circle(v2Drawing,1,2,3),
            new Rectangle(v1Drawing, 1,2,3,4),
            new Rectangle(v2Drawing, 1,2,3,4)
        );

        shapesToDraw
                .stream()
                .forEach(Shape::draw);
    }
}
