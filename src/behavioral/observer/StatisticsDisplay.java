package behavioral.observer;

public class StatisticsDisplay implements Observer{

    public StatisticsDisplay(WeatherData weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display(temp, humidity, pressure);
    }

    private void display(float temp, float humidity, float pressure){
        System.out.println("Statistics Display: Temperature = " + temp +
                "C, Humidity = " + humidity + "%, Pressure = " + pressure + "hPa");
    }
}
