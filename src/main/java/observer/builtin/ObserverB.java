package observer.builtin;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ralph on 7/15/15 4:59 PM.
 */
public class ObserverB implements Observer {
    private Observable observable;

    public ObserverB(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ObserverB: get updated value: " + ((Observed) observable).getValueToObserve());
    }
}
