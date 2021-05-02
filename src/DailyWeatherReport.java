import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {
    GregorianCalendar date;
    LinkedList<Double> listOfTemperature;
    LinkedList<Double> listOfRainfall;

    DailyWeatherReport(GregorianCalendar date,
            LinkedList<Double> listOfTemperature,
            LinkedList<Double> listOfRainfall) {

        this.date = date;
        this.listOfTemperature = listOfTemperature;
        this.listOfRainfall = listOfRainfall;
    }
}
