package patterns.observer;

import patterns.observer.observable.WeatherData;
import patterns.observer.observers.AppleWeatherObserver;
import patterns.observer.observers.MeteoProgObserver;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new AppleWeatherObserver(weatherData);
        MeteoProgObserver meteoProgObserver = new MeteoProgObserver(weatherData);

        weatherData.setTemperature(5);

        weatherData.removeObserver(meteoProgObserver);

        weatherData.setTemperature(2);

    }

}
