package behavioral.observer;

public class WeatherStationMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);

        weatherData.setWhetherData(23.5f,56, 56.78f);

        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setWhetherData(28.5f,42, 74.54f);

    }
}
