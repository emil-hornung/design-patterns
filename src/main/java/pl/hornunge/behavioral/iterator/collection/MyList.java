package pl.hornunge.behavioral.iterator.collection;

import pl.hornunge.behavioral.iterator.iterator.MyIterator;

public interface MyList<T> {
    void add(T element);

    MyIterator<T> iterator();
}
