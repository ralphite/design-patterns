package decorator;

/**
 * Created by ralph on 7/16/15 12:17 PM.
 */
public class Milk extends CondimentDecorator {
    private CoffeeDecoratee decoratee;

    public Milk(CoffeeDecoratee decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public String getDescription() {
        return decoratee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return decoratee.cost() + 0.2;
    }
}
