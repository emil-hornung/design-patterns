package pl.hornunge.structural.bridge.example2.graphic_interface;

public class AndroidGraphicInterface implements GraphicInterface {
    @Override
    public void drawLine(int fromX, int fromY, int toX, int toY) {
        System.out.println(String.format("Drawing line on Android (%d,%d) -> (%d,%d).", fromX, fromY, toX, toY));
    }

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println(String.format("Drawing circle on Android (%d,%d,%d).", x, y, radius));
    }
}
