import java.util.LinkedList;
import java.util.GregorianCalendar;

public class WeatherMonitor {
    LinkedList<DailyWeatherReport> reports;

    public WeatherMonitor() {
        this.reports = new LinkedList<DailyWeatherReport>();
    }

    public WeatherMonitor(LinkedList<DailyWeatherReport> reports) {
        this.reports = reports;
    }


//    consumes a month[0,11] where 0 is January and 11 is December and a year
//    produces the average temperature for all days in a specified month
    public double averageTempForMonth(int month, int year) {
        double sumOfTemp = 0;
        int counter = 0;

        for(DailyWeatherReport aDailyReport: reports) {
            if((aDailyReport.date.get(GregorianCalendar.MONTH)) == month
            && (aDailyReport.date.get(GregorianCalendar.YEAR) == year)) {
                for(Double temps: aDailyReport.listOfTemperature) {
                    sumOfTemp += temps;
                    counter ++;
                }
            }
        }
        return sumOfTemp / counter;
    }

    //    consumes a month[0,11] where 0 is January and 11 is December and a year
    //    produces the total rainfall for all days in a specified month
    public double totalRainfallForMonth(int month, int year) {
        double sumOfRainfall = 0;

        for (DailyWeatherReport aDailyReport : reports) {
            if ((aDailyReport.date.get(GregorianCalendar.MONTH)) == month
                    && (aDailyReport.date.get(GregorianCalendar.YEAR) == year)) {
                for (Double rainfall : aDailyReport.listOfRainfall) {
                    sumOfRainfall += rainfall;
                }
            }
        }
        return sumOfRainfall;
    }

    // consumes a date and a list of readings (for that date) and
    // creates and stores a daily report for that given date
    // THE WEATERMONITOR'S DAILY REPORTS SHOULD BE STORED IN A LINKED LIST
    // ASSUME: a daily report for the provided date does not already exist
    public WeatherMonitor addDailyReport(GregorianCalendar date,
                                         LinkedList<Reading> readings) {
//        I almost think that this method should return void.
        LinkedList<Double> temps = new LinkedList<>();
        LinkedList<Double> rainfalls = new LinkedList<>();
        for(Reading aReading: readings) {
            temps.add(aReading.temperature);
            rainfalls.add(aReading.rainfall);
        }

        DailyWeatherReport aNewDailyWeatherReport = new DailyWeatherReport(date, temps, rainfalls);
        this.reports.add(aNewDailyWeatherReport);
        return this;
    }

    /* This is what a date looks like
    *  GregorianCalendar date = new GregorianCalendar(2016, 11, 17);
    int month = date.get(GregorianCalendar.MONTH);  // value of month will be 11
    * */

}
