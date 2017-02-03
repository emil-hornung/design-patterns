package pl.hornunge.creational.singleton.thread_safe;

public class SynchronizedSingleton {
    private static SynchronizedSingleton INSTANCE;

    private SynchronizedSingleton(){
    }

    public static synchronized SynchronizedSingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new SynchronizedSingleton();
        }
        return INSTANCE;
    }

    public void someMethod(){
        System.out.println(this);
    }
}
