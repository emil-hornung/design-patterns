package pl.hornunge.behavioral.visitor.objects;

import pl.hornunge.behavioral.visitor.visitor.PrintVisitor;

public class SomeObject implements VisitableObject {
    public String saySomething(){
        return  "something";
    }

    @Override
    public void accept(PrintVisitor visitor) {
        visitor.visit(this);
    }
}
