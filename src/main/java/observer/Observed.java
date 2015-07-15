package observer;

import java.util.ArrayList;

/**
 * Created by ralph on 7/15/15 2:38 PM.
 */
public class Observed implements Observable {

    private String valueToObserve;

    private ArrayList<Observer> observers;

    public Observed() {
        valueToObserve = "init value";
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getValueToObserve() {
        return valueToObserve;
    }

    public void setValueToObserve(String newValue) {
        this.valueToObserve = newValue;
    }
}
