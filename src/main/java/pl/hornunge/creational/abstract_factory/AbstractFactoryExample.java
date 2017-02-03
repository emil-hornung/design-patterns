package pl.hornunge.creational.abstract_factory;

import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;
import pl.hornunge.creational.abstract_factory.component_factory.ComponentFactory;
import pl.hornunge.creational.abstract_factory.component_factory.MacComponentFactory;
import pl.hornunge.creational.abstract_factory.component_factory.MsComponentFactory;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        ComponentFactory componentFactory = getComponentFactoryBasedOnOs();
        componentFactory.createWindow();
        componentFactory.createScrollbar();
    }

    private static ComponentFactory getComponentFactoryBasedOnOs() {
        String os = System.getProperty("os.name");
        if (os.contains("Windows")) {
            return new MsComponentFactory();
        }
        if (os.contains("Mac")) {
            return new MacComponentFactory();
        }
        throw new IllegalStateException("OS not recognised or not supported.");
    }
}
