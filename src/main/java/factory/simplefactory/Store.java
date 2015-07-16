package factory.simplefactory;

/**
 * Created by ralph on 7/16/15 6:14 PM.
 */
public class Store {
    private SimpleFactory factory;

    public Store(SimpleFactory factory) {
        this.factory = factory;
    }

    public Product order(Product.Type type) {
        return factory.makeProduct(type);
    }
}
