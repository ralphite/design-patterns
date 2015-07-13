package singleton;

/**
 * Created by ralph on 7/13/15 3:50 PM.
 */
public class DoubleCheckedLockingSingleton {
    // must be volatile otherwise not completely initialized instance may be returned
    // http://www.infoq.com/cn/articles/double-checked-locking-with-delay-initialization
    private volatile static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return instance;
    }
}
