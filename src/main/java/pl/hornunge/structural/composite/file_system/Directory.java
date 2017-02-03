package pl.hornunge.structural.composite.file_system;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Node {

    private final List<Node> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void addChild(Node node){
        children.add(node);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println("[" + getName() + "]");

        children
                .stream()
                .sorted()
                .forEach(node -> node.print(indent+1));
    }

    @Override
    protected double getOrder() {
        return 1;
    }

    @Override
    public void print() {
        print(0);
    }
}
