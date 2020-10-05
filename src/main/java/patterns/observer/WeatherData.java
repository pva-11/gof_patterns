package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ObservableSubject{

    private List<Observer> observers;
    private int temperature;
    private boolean changed;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature!=this.temperature) {
            setChanged();
        }
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        if (changed) {
            for (Observer observer: observers) {
                observer.update(getTemperature());
            }
            changed = false;
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void setChanged() {
        changed = true;
    }

}
