package strategy;

/**
 * Created by ralph on 7/13/15 2:33 PM.
 */
public abstract class Developer {
    private CodeStrategy codeStrategy;  // delegate algorithms to strategy classes
    private DebugStrategy debugStrategy;

    public void drinkCoffee() {
        System.out.println("All developers drink coffee.");
    }

    public void performCode() {
        codeStrategy.code();
    }

    public void performDebug() {
        debugStrategy.debug();
    }

    public void setCodeStrategy(CodeStrategy codeStrategy) {
        this.codeStrategy = codeStrategy;
    }

    public void setDebugStrategy(DebugStrategy debugStrategy) {
        this.debugStrategy = debugStrategy;
    }
}
