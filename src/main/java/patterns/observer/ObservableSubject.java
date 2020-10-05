package patterns.observer;

public interface ObservableSubject {

    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);

    void setChanged();

}
