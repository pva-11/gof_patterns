package patterns.observer;

public class MeteoProgObserver implements Observer {

    ObservableSubject weatherData;

    public MeteoProgObserver(ObservableSubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(int updateValue) {
        System.out.println("Meteo prog temperature: " + updateValue);
    }
}
