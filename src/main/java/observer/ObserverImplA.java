package observer;

/**
 * Created by ralph on 7/15/15 2:38 PM.
 */
public class ObserverImplA implements Observer {
    private Observed observed;

    public ObserverImplA(Observed observed) {
        this.observed = observed;
        observed.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("ObserverImplA: get updated value: " + observed.getValueToObserve());
    }
}
