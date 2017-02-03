package pl.hornunge.structural.composite.file_system;

public class File extends Node {

    public File(String name) {
        super(name);
    }

    @Override
    public void print(int indent) {
        printIndent(indent);
        System.out.println(getName());
    }

    @Override
    protected double getOrder() {
        return 2;
    }

    @Override
    public void print() {
        print(0);
    }

}
