package singleton.synchronizedgetinstance;

/**
 * Created by ralph on 7/13/15 3:46 PM.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    // bad performance when many threads are calling getInstance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
