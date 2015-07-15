package observer.builtin;

/**
 * Created by ralph on 7/15/15 5:00 PM.
 */
public class Main {
    public static void main(String[] args) {
        Observed observed = new Observed();
        ObserverA a = new ObserverA(observed);
        ObserverB b = new ObserverB(observed);

        System.out.println("---------------");

        observed.notifyObservers();

        System.out.println("---------------");

        observed.setValueToObserve("new value");
        observed.notifyObservers();

        System.out.println("---------------");

        observed.deleteObserver(a);
        observed.notifyObservers();

        System.out.println("---------------");

        observed.setValueToObserve("latest value");
        observed.notifyObservers();
    }
}
