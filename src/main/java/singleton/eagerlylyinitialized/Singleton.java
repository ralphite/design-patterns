package singleton.eagerlylyinitialized;

/**
 * Created by ralph on 7/13/15 3:34 PM.
 */
public class Singleton {
    // good enough if initialization is not heavy
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
