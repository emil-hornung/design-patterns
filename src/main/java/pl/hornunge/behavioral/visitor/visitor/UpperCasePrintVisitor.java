package pl.hornunge.behavioral.visitor.visitor;

import pl.hornunge.behavioral.visitor.objects.SomeObject;
import pl.hornunge.behavioral.visitor.objects.SomeOtherObject;
import pl.hornunge.behavioral.visitor.objects.TotallyDifferentObject;

public class UpperCasePrintVisitor implements PrintVisitor {
    @Override
    public void visit(SomeObject someObject) {
        System.out.println("Printing in upper case: " + someObject.saySomething().toUpperCase());
    }

    @Override
    public void visit(SomeOtherObject someOtherObject) {
        System.out.println("Printing in upper case: " + someOtherObject.saySomethingElse().toUpperCase());
    }

    @Override
    public void visit(TotallyDifferentObject totallyDifferentObject) {
        System.out.println("Printing in upper case: " + totallyDifferentObject.saySomethingTotallyDifferent().toUpperCase());
    }
}
