package patterns.observer.observers;

import patterns.observer.observable.ObservableSubject;

public class AppleWeatherObserver implements Observer {

    ObservableSubject weatherData;

    public AppleWeatherObserver(ObservableSubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(int updateValue) {
        System.out.println("AppleWeather temperature: " + updateValue);
    }

}
