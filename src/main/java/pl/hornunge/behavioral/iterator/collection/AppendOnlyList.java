package pl.hornunge.behavioral.iterator.collection;

import pl.hornunge.behavioral.iterator.iterator.FixOrderIterator;
import pl.hornunge.behavioral.iterator.iterator.MyIterator;

import java.util.ArrayList;
import java.util.List;

public class AppendOnlyList<T> implements MyList<T> {

    private List<T> list = new ArrayList();

    @Override
    public void add(T element){
        list.add(element);
    }

    @Override
    public MyIterator<T> iterator(){
        return new FixOrderIterator<>(list);
    }
}
