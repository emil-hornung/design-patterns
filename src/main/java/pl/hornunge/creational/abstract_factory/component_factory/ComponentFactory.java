package pl.hornunge.creational.abstract_factory.component_factory;

import pl.hornunge.creational.abstract_factory.scrollbar.Scrollbar;
import pl.hornunge.creational.abstract_factory.window.Window;

public interface ComponentFactory {
    Window createWindow();
    Scrollbar createScrollbar();
}
