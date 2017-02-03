package pl.hornunge.behavioral.visitor.objects;

import pl.hornunge.behavioral.visitor.visitor.PrintVisitor;

public interface VisitableObject {
    void accept(PrintVisitor visitor);
}
