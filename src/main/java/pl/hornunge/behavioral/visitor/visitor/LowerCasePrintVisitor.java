package pl.hornunge.behavioral.visitor.visitor;

import pl.hornunge.behavioral.visitor.objects.SomeObject;
import pl.hornunge.behavioral.visitor.objects.SomeOtherObject;
import pl.hornunge.behavioral.visitor.objects.TotallyDifferentObject;

public class LowerCasePrintVisitor implements PrintVisitor {
    @Override
    public void visit(SomeObject someObject) {
        System.out.println("Printing in lower case: " + someObject.saySomething().toLowerCase());
    }

    @Override
    public void visit(SomeOtherObject someOtherObject) {
        System.out.println("Printing in lower case: " + someOtherObject.saySomethingElse().toLowerCase());
    }

    @Override
    public void visit(TotallyDifferentObject totallyDifferentObject) {
        System.out.println("Printing in lower case: " + totallyDifferentObject.saySomethingTotallyDifferent().toLowerCase());
    }
}
