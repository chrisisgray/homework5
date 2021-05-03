import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {
    private GregorianCalendar date;
    private LinkedList<Double> listOfTemperature;
    private LinkedList<Double> listOfRainfall;


    public DailyWeatherReport(GregorianCalendar date,
                       LinkedList<Double> listOfTemperature,
                       LinkedList<Double> listOfRainfall) {

        this.date = date;
        this.listOfTemperature = listOfTemperature;
        this.listOfRainfall = listOfRainfall;
    }

    public double getSumOfTemp(int month, int year) {
        double sumOfTemp = 0;

        if((this.date.get(GregorianCalendar.MONTH)) == month
                && (this.date.get(GregorianCalendar.YEAR) == year)) {
            for(Double temps:listOfTemperature) {
                sumOfTemp += temps;
            }
        }
        return sumOfTemp;
    }

    public double getCountOfTemp(int month, int year) {
        double counter = 0;
        if((this.date.get(GregorianCalendar.MONTH)) == month
                && (this.date.get(GregorianCalendar.YEAR) == year)) {
            counter = listOfTemperature.size();
        }
        return counter;
    }

    public double getSumOfRainfall(int month, int year) {
        double sumOfRainfall = 0;

        if((this.date.get(GregorianCalendar.MONTH)) == month
                && (this.date.get(GregorianCalendar.YEAR) == year)) {
            for(Double rainfall :listOfRainfall) {
                sumOfRainfall += rainfall;
            }
        }
        return sumOfRainfall;
    }
}
