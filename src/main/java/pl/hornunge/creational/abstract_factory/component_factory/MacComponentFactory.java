package pl.hornunge.creational.abstract_factory.component_factory;

import pl.hornunge.creational.abstract_factory.scrollbar.MacScrollbar;
import pl.hornunge.creational.abstract_factory.scrollbar.Scrollbar;
import pl.hornunge.creational.abstract_factory.window.MacWindow;
import pl.hornunge.creational.abstract_factory.window.Window;

public class MacComponentFactory implements ComponentFactory {
    @Override
    public Window createWindow() {
        return new MacWindow();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new MacScrollbar();
    }
}
