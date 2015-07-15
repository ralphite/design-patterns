package observer;

/**
 * Created by ralph on 7/15/15 2:53 PM.
 */
public class Main {
    public static void main(String[] args) {
        Observed observed = new Observed();
        ObserverImplA observerImplA = new ObserverImplA(observed);
        ObserverImplB observerImplB = new ObserverImplB(observed);

        observed.notifyObservers();

        observed.setValueToObserve("new value");
        observed.notifyObservers();

        observed.removeObserver(observerImplA);
        observed.setValueToObserve("latest value");
        observed.notifyObservers();
    }
}
