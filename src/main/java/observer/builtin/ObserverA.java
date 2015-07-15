package observer.builtin;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ralph on 7/15/15 4:39 PM.
 */
public class ObserverA implements Observer {
    private Observable observable;

    public ObserverA(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ObserverA: get updated value: " + ((Observed)observable).getValueToObserve());
    }
}
