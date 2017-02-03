package pl.hornunge.creational.abstract_factory.component_factory;

import pl.hornunge.creational.abstract_factory.scrollbar.MsScrollbar;
import pl.hornunge.creational.abstract_factory.scrollbar.Scrollbar;
import pl.hornunge.creational.abstract_factory.window.MsWindow;
import pl.hornunge.creational.abstract_factory.window.Window;

public class MsComponentFactory implements ComponentFactory {
    @Override
    public Window createWindow() {
        return new MsWindow();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new MsScrollbar();
    }
}
