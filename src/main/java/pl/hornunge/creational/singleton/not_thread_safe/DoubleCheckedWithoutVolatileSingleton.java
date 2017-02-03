package pl.hornunge.creational.singleton.not_thread_safe;

public class DoubleCheckedWithoutVolatileSingleton {
    private static DoubleCheckedWithoutVolatileSingleton INSTANCE;

    private DoubleCheckedWithoutVolatileSingleton(){
    }

    public static DoubleCheckedWithoutVolatileSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (DoubleCheckedWithoutVolatileSingleton.class){
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedWithoutVolatileSingleton();
                }
            }

        }
        return INSTANCE;
    }

    public void someMethod(){
        System.out.println(this);
    }
}
