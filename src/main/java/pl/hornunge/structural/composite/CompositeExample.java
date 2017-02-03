package pl.hornunge.structural.composite;

import pl.hornunge.structural.composite.file_system.Directory;
import pl.hornunge.structural.composite.file_system.File;
import pl.hornunge.structural.composite.file_system.Node;

import java.awt.*;

public class CompositeExample {
    public static void main(String[] args) {
        createComposite().print();
    }

    public static Node createComposite(){
        Node dir1 = new Directory("dir1");
        dir1.addChild(new File("file1_1"));
        dir1.addChild(new File("file1_2"));
        dir1.addChild(new File("file1_3"));

        Node dir_1_1 = new Directory("dir_1_1");
        dir1.addChild(dir_1_1);
        dir_1_1.addChild(new File("file_1_1_1"));
        dir_1_1.addChild(new File("file_1_1_2"));
        dir_1_1.addChild(new File("file_1_1_3"));
        dir_1_1.addChild(new File("file_1_1_4"));

        Node dir_1_2 = new Directory("dir_1_2");
        dir1.addChild(dir_1_2);
        dir_1_2.addChild(new File("file_1_2_1"));
        dir_1_2.addChild(new File("file_1_2_2"));

        Node dir_1_2_1 = new Directory("dir_1_2_1");
        dir_1_2.addChild(dir_1_2_1);
        dir_1_2_1.addChild(new File("file_1_2_1_1"));

        Node dir_1_3 = new Directory("dir_1_3");
        dir1.addChild(dir_1_3);
        dir_1_2.addChild(new File("file_1_3_1"));


        Container component;
        return dir1;
    }
}
