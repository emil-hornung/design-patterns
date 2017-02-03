package pl.hornunge.structural.composite.file_system;

import static com.google.common.base.Preconditions.checkNotNull;

public abstract class Node implements Comparable<Node> {

    private final String name;

    protected Node(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected abstract void print(int indent);

    protected void printIndent(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("\t");
        }
    }

    protected abstract double getOrder();

    private int compareByName(Node other) {
        return getName().compareTo(other.getName());
    }

    private int compareByOrder(Node other) {
        return new Double(getOrder()).compareTo(other.getOrder());
    }

    private boolean haveDifferentOrder(Node other) {
        return getOrder() != other.getOrder();
    }

    public void addChild(Node node) {
        throw new UnsupportedOperationException();
    }



    public abstract void print();

    @Override
    public int compareTo(Node other) {
        checkNotNull(other);
        return haveDifferentOrder(other) ?
                compareByOrder(other) :
                compareByName(other);
    }
}
