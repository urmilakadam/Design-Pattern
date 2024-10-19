package behavioral.observer;

public class CurrentConditionsDisplay implements Observer{

    public CurrentConditionsDisplay(WeatherData weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display(temp, humidity, pressure);
    }

    private void display(float temp, float humidity, float pressure){
        System.out.println("Current Condition Display: Temperature = " + temp +
                "C, Humidity = " + humidity + "%, Pressure = " + pressure + "hPa");
    }

}
