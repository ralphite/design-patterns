package singleton;

/**
 * Created by ralph on 7/13/15 3:46 PM.
 */
public class SynchronizedGetInstanceSingleton {
    private static SynchronizedGetInstanceSingleton instance;

    private SynchronizedGetInstanceSingleton() {
    }

    // bad performance when many threads are calling getInstance
    public static synchronized SynchronizedGetInstanceSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedGetInstanceSingleton();
        }
        return instance;
    }
}
