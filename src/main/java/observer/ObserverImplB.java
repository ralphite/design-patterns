package observer;

/**
 * Created by ralph on 7/15/15 2:50 PM.
 */
public class ObserverImplB implements Observer {
    private Observed observed;

    public ObserverImplB(Observed observed) {
        this.observed = observed;
        this.observed.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("ObserverImplB: get updated value: " + this.observed.getValueToObserve());
    }
}
