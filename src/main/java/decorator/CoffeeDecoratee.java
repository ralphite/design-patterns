package decorator;

/**
 * Created by ralph on 7/16/15 1:04 AM.
 */
public class CoffeeDecoratee {

    public String getDescription() {
        return "Plain Coffee";
    }

    public double cost() {
        return 1.0;
    }

    @Override
    public String toString() {
        return getDescription() + " => Cost: " + cost();
    }
}
