package pl.hornunge.creational.singleton.thread_safe.reflection_proof;

public enum EnumSingleton {
    INSTANCE;

    public void someMethod(){
        System.out.println(getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(this)));
    }
}
