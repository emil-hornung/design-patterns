package pl.hornunge.creational.singleton.thread_safe;

public class TrivialEagerSingleton {

    private static final TrivialEagerSingleton INSTANCE = new TrivialEagerSingleton();

    private TrivialEagerSingleton() {
    }

    public static TrivialEagerSingleton getInstance(){
        return INSTANCE;
    }

    public void someMethod(){
        System.out.println(this);
    }
}
