package pl.hornunge.creational.singleton.thread_safe;

import java.util.concurrent.atomic.AtomicReference;

public class DoubleCheckedWithAtomicReferenceSingleton {
    private static AtomicReference<DoubleCheckedWithAtomicReferenceSingleton> INSTANCE = new AtomicReference<>();

    private DoubleCheckedWithAtomicReferenceSingleton(){
    }
    //I don't feel confident with the code below, do not treat it like a good example.
    public static DoubleCheckedWithAtomicReferenceSingleton getInstance(){
        if (INSTANCE.get() == null){
            INSTANCE.compareAndSet(null, new DoubleCheckedWithAtomicReferenceSingleton());
        }
        return INSTANCE.get();
    }

    public void someMethod(){
        System.out.println(this);
    }
}
