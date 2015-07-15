package observer.builtin;

import java.util.Observable;

/**
 * Created by ralph on 7/15/15 4:40 PM.
 */
public class Observed extends Observable {
    private String valueToObserve;

    public Observed() {
        valueToObserve = "init value";
    }

    public String getValueToObserve() {
        return valueToObserve;
    }

    public void setValueToObserve(String valueToObserve) {
        this.valueToObserve = valueToObserve;
        this.setChanged();
    }
}
