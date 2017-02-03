package pl.hornunge.behavioral.visitor.visitor;

import pl.hornunge.behavioral.visitor.objects.SomeObject;
import pl.hornunge.behavioral.visitor.objects.SomeOtherObject;
import pl.hornunge.behavioral.visitor.objects.TotallyDifferentObject;

public class DefaultPrintVisitor implements PrintVisitor {
    @Override
    public void visit(SomeObject someObject) {
        System.out.println("Printing as it is: " +  someObject.saySomething());
    }

    @Override
    public void visit(SomeOtherObject someOtherObject) {
        System.out.println("Printing as it is: " +  someOtherObject.saySomethingElse());
    }

    @Override
    public void visit(TotallyDifferentObject totallyDifferentObject) {
        System.out.println("Printing as it is: " +  totallyDifferentObject.saySomethingTotallyDifferent());
    }
}
