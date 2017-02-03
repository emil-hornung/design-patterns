package pl.hornunge.creational.singleton.thread_safe;

public class InnerClassHolderSingleton {
    private InnerClassHolderSingleton() {
    }

    private static class Holder{
        private static final InnerClassHolderSingleton INSTANCE = new InnerClassHolderSingleton();
    }

    public static InnerClassHolderSingleton getInstance(){
        return Holder.INSTANCE;
    }

    public void someMethod(){
        System.out.println(this);
    }
}
