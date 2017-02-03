package pl.hornunge.structural.bridge.example2;

import pl.hornunge.structural.bridge.example2.graphic_interface.AndroidGraphicInterface;
import pl.hornunge.structural.bridge.example2.graphic_interface.GraphicInterface;
import pl.hornunge.structural.bridge.example2.graphic_interface.WindowsGraphicInterface;
import pl.hornunge.structural.bridge.example2.shape.Circle;
import pl.hornunge.structural.bridge.example2.shape.Rectangle;

public class BridgeExample {
    public static void main(String[] args) {
        Circle circle = new Circle(1,2,5);
        Rectangle rectangle = new Rectangle(0,0,10,10);

        GraphicInterface windowsGraphicInterface = new WindowsGraphicInterface();
        GraphicInterface androidGraphicInterface = new AndroidGraphicInterface();

        circle.draw(windowsGraphicInterface);
        circle.draw(androidGraphicInterface);
        rectangle.draw(windowsGraphicInterface);
        rectangle.draw(androidGraphicInterface);
    }
}
