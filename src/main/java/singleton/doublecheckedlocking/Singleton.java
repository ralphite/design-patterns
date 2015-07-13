package singleton.doublecheckedlocking;

/**
 * Created by ralph on 7/13/15 3:50 PM.
 */
public class Singleton {
    // must be volatile otherwise not completely initialized instance may be returned
    // http://www.infoq.com/cn/articles/double-checked-locking-with-delay-initialization
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
