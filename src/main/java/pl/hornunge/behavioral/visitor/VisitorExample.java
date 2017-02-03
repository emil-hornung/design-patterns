package pl.hornunge.behavioral.visitor;

import pl.hornunge.behavioral.visitor.objects.SomeObject;
import pl.hornunge.behavioral.visitor.objects.SomeOtherObject;
import pl.hornunge.behavioral.visitor.objects.TotallyDifferentObject;
import pl.hornunge.behavioral.visitor.objects.VisitableObject;
import pl.hornunge.behavioral.visitor.visitor.DefaultPrintVisitor;
import pl.hornunge.behavioral.visitor.visitor.LowerCasePrintVisitor;
import pl.hornunge.behavioral.visitor.visitor.UpperCasePrintVisitor;

public class VisitorExample {
    public static void main(String[] args) {
        Objects objects = new Objects(new SomeObject(), new SomeOtherObject(), new TotallyDifferentObject());

        for (VisitableObject object : objects){
            object.accept(new DefaultPrintVisitor());
        }

        for (VisitableObject object : objects){
            object.accept(new UpperCasePrintVisitor());
        }

        for (VisitableObject object : objects){
            object.accept(new LowerCasePrintVisitor());
        }

    }
}
