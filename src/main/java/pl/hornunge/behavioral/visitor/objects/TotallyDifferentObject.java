package pl.hornunge.behavioral.visitor.objects;

import pl.hornunge.behavioral.visitor.visitor.PrintVisitor;

public class TotallyDifferentObject implements VisitableObject {
    public String saySomethingTotallyDifferent(){
        return "something totally different";
    }

    @Override
    public void accept(PrintVisitor visitor) {
        visitor.visit(this);
    }

}
