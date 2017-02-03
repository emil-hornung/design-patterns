package pl.hornunge.creational.abstract_factory.window;

public class MsWindow implements Window {
    @Override
    public void setTitle(String title) {
        System.out.println("Setting MsWindow title to: " + title);
    }

    @Override
    public void repaint() {
        System.out.println("Repainting MsWindow.");
    }
}
