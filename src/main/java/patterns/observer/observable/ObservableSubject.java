package patterns.observer.observable;

import patterns.observer.observers.Observer;

public interface ObservableSubject {

    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);

    void setChanged();

}
