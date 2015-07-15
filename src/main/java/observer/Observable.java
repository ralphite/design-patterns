package observer;

/**
 * Created by ralph on 7/15/15 2:32 PM.
 */
public interface Observable {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
