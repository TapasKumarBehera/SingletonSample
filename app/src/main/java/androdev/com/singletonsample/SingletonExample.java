package androdev.com.singletonsample;

public final class SingletonExample {

    private static volatile SingletonExample singletonExample = null;

    private SingletonExample() {
    }

    public static SingletonExample getSingletonInstance(){

        if(singletonExample == null) {
            synchronized (SingletonExample.class) {
                if (singletonExample == null)
                    singletonExample = new SingletonExample();
            }
        }

        return singletonExample;
    }
}
