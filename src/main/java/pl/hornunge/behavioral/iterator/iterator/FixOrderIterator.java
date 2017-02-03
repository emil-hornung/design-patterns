package pl.hornunge.behavioral.iterator.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class FixOrderIterator<T> implements MyIterator<T> {

    private final List<T> list;
    private int currentIndex = 0;

    public FixOrderIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !list.isEmpty() && currentIndex < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }

        T result = list.get(currentIndex);
        currentIndex++;
        return result;
    }
}
