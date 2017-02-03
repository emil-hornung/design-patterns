package pl.hornunge.behavioral.visitor.visitor;

import pl.hornunge.behavioral.visitor.objects.SomeObject;
import pl.hornunge.behavioral.visitor.objects.SomeOtherObject;
import pl.hornunge.behavioral.visitor.objects.TotallyDifferentObject;

public interface PrintVisitor {
    void visit(SomeObject someObject);
    void visit(SomeOtherObject someOtherObject);
    void visit(TotallyDifferentObject totallyDifferentObject);

}
