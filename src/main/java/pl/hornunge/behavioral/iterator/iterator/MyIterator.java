package pl.hornunge.behavioral.iterator.iterator;

public interface MyIterator<T> {
    boolean hasNext();
    T next();
//    in java.util.MyIterator there are also 2 other methods:
//    remove()
//    forEachRemaining(Consumer<? super E> action)
}
