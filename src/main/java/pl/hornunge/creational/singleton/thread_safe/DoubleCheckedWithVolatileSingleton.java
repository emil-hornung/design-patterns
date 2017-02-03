package pl.hornunge.creational.singleton.thread_safe;

public class DoubleCheckedWithVolatileSingleton {
    private static volatile DoubleCheckedWithVolatileSingleton INSTANCE;

    private DoubleCheckedWithVolatileSingleton(){
    }

    public static DoubleCheckedWithVolatileSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (DoubleCheckedWithVolatileSingleton.class){
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedWithVolatileSingleton();
                }
            }

        }
        return INSTANCE;
    }

    public void someMethod(){
        System.out.println(this);
    }
}
