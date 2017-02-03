package pl.hornunge.behavioral.iterator;

import pl.hornunge.behavioral.iterator.collection.AppendOnlyList;
import pl.hornunge.behavioral.iterator.collection.MyList;
import pl.hornunge.behavioral.iterator.iterator.MyIterator;

public class IteratorExample {
    public static void main(String[] args) {
        MyList<String> list = new AppendOnlyList<>();
        System.out.println("---List 1---");
        printList(list);
        System.out.println("---End of List 1---");
        list.add("abc");
        list.add("def");
        list.add("ghi");
        System.out.println("---List 2---");
        printList(list);
        System.out.println("---End of List 2---");

    }

    private static void printList(MyList<String> list) {
        MyIterator<String> myIterator = list.iterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}
