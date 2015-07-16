package factory.simplefactory;

/**
 * Created by ralph on 7/16/15 6:17 PM.
 */
public interface Product {
    public abstract String name();

    public enum Type {
        A, B
    }
}
