package decorator;

/**
 * Created by ralph on 7/16/15 12:14 PM.
 */
public class Sugar extends CondimentDecorator {
    private CoffeeDecoratee decoratee;

    public Sugar(CoffeeDecoratee decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public String getDescription() {
        return decoratee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return decoratee.cost() + 0.1;
    }
}
