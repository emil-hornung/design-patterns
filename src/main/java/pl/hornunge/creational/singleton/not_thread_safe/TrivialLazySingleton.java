package pl.hornunge.creational.singleton.not_thread_safe;

public class TrivialLazySingleton {

    private static TrivialLazySingleton INSTANCE;

    private TrivialLazySingleton(){
    }

    public static TrivialLazySingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new TrivialLazySingleton();
        }
        return INSTANCE;
    }

    public void someMethod(){
        System.out.println(this);
    }
}
