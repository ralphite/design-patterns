package singleton;

/**
 * Created by ralph on 7/13/15 3:34 PM.
 */
public class EagerlyInitializedSingleton {
    // good enough if initialization is not heavy
    private static EagerlyInitializedSingleton instance = new EagerlyInitializedSingleton();

    private EagerlyInitializedSingleton() {
    }

    public static EagerlyInitializedSingleton getInstance() {
        return instance;
    }
}
