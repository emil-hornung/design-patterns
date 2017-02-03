package pl.hornunge.creational.abstract_factory

import pl.hornunge.creational.abstract_factory.component_factory.ComponentFactory
import pl.hornunge.creational.abstract_factory.component_factory.MacComponentFactory
import pl.hornunge.creational.abstract_factory.component_factory.MsComponentFactory
import pl.hornunge.creational.abstract_factory.scrollbar.MsScrollbar
import pl.hornunge.creational.abstract_factory.scrollbar.Scrollbar
import pl.hornunge.creational.abstract_factory.window.MsWindow
import pl.hornunge.creational.abstract_factory.window.Window
import spock.lang.Specification
import spock.lang.Subject

class AbstractFactorySpec extends Specification {

    @Subject
    ComponentFactory componentFactory;

    def 'should create components based on OS'() {
        given:
            componentFactory = getComponentFactoryBasedOnOs()
        when:
            Window window = componentFactory.createWindow()
            Scrollbar scrollbar = componentFactory.createScrollbar()
        then:
            MsWindow == window.class
            MsScrollbar == scrollbar.class
    }

    private ComponentFactory getComponentFactoryBasedOnOs() {
        String os = System.getProperty("os.name")
        if (os.contains("Windows")) {
            return new MsComponentFactory()
        }
        if (os.contains("Mac")) {
            return new MacComponentFactory()
        }
        throw new IllegalStateException("OS not recognised or not supported.")
    }

}
