package factory.simplefactory;

/**
 * Created by ralph on 7/16/15 6:15 PM.
 */
public class SimpleFactory {
    public Product makeProduct(Product.Type type) {
        Product product = null;
        switch (type) {
            case A:
                product = new Product() {
                    @Override
                    public String name() {
                        return "Product A";
                    }
                };
                break;
            case B:
                product = new Product() {
                    @Override
                    public String name() {
                        return "Product B";
                    }
                };
                break;
        }
        return product;
    }
}
