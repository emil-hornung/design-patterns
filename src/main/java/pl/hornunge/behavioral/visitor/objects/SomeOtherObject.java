package pl.hornunge.behavioral.visitor.objects;

import pl.hornunge.behavioral.visitor.visitor.PrintVisitor;

public class SomeOtherObject implements VisitableObject {
    public String saySomethingElse() {
        return "something else";
    }

    @Override
    public void accept(PrintVisitor visitor) {
        visitor.visit(this);
    }

}
