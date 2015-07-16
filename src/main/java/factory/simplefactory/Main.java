package factory.simplefactory;

/**
 * Created by ralph on 7/16/15 6:27 PM.
 */
public class Main {
    public static void main(String[] args) {
        Store store = new Store(new SimpleFactory());
        System.out.println("Ordered " + store.order(Product.Type.A).name());
        System.out.println("Ordered " + store.order(Product.Type.B).name());
    }
}
