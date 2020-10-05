package patterns.observer;

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
