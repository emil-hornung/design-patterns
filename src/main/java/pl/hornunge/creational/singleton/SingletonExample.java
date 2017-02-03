package pl.hornunge.creational.singleton;

import pl.hornunge.creational.singleton.not_thread_safe.DoubleCheckedWithoutVolatileSingleton;
import pl.hornunge.creational.singleton.not_thread_safe.TrivialLazySingleton;
import pl.hornunge.creational.singleton.thread_safe.DoubleCheckedWithAtomicReferenceSingleton;
import pl.hornunge.creational.singleton.thread_safe.DoubleCheckedWithVolatileSingleton;
import pl.hornunge.creational.singleton.thread_safe.InnerClassHolderSingleton;
import pl.hornunge.creational.singleton.thread_safe.SynchronizedSingleton;
import pl.hornunge.creational.singleton.thread_safe.TrivialEagerSingleton;
import pl.hornunge.creational.singleton.thread_safe.reflection_proof.EnumSingleton;

import java.awt.*;

public class SingletonExample {
    public static void main(String[] args) {
        TrivialLazySingleton.getInstance().someMethod();
        TrivialEagerSingleton.getInstance().someMethod();
        SynchronizedSingleton.getInstance().someMethod();
        DoubleCheckedWithoutVolatileSingleton.getInstance().someMethod();
        DoubleCheckedWithVolatileSingleton.getInstance().someMethod();
        DoubleCheckedWithAtomicReferenceSingleton.getInstance().someMethod();
        InnerClassHolderSingleton.getInstance().someMethod();
        EnumSingleton.INSTANCE.someMethod();

        System.out.println(Runtime.getRuntime());
        System.out.println(Desktop.getDesktop());


    }
}
