package pl.hornunge.behavioral.visitor;

import com.google.common.collect.Lists;
import pl.hornunge.behavioral.visitor.objects.VisitableObject;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Objects implements Iterable<VisitableObject> {
    private final List<VisitableObject> objects;

    public Objects(VisitableObject... visitableObjects) {
        objects = Arrays.asList(visitableObjects);
    }

    @Override
    public Iterator<VisitableObject> iterator() {
        return Lists.reverse(objects).iterator();
    }
}
