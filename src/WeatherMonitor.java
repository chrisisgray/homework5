import java.util.LinkedList;

public class WeatherMonitor {
    LinkedList<DailyWeatherReport> reports;

    public WeatherMonitor() {}


//    consumes a month[0,11] where 0 is January and 11 is December and a year
//    produces the average temperature for all days in a specified month
    public double averageTempForMonth(int month, int year) {
        return 0;
    }

    //    consumes a month[0,11] where 0 is January and 11 is December and a year
    //    produces the total rainfall for all days in a specified month
    public double totalRainfallForMonth(int month, int year) {
        return 0;
    }

    // consumes a date and a list of readings (for that date) and
    // creates and stores a daily report for that given date
    // THE WEATERMONITOR'S DAILY REPORTS SHOULD BE STORED IN A LINKED LIST
    // ASSUME: a daily report for the provided date does not already exist
    public LinkedList<DailyWeatherReport> addDailyReport() {
//        I almost think that this method should return void.
        return new LinkedList<DailyWeatherReport>();
    }

    /* This is what a date looks like
    *  GregorianCalendar date = new GregorianCalendar(2016, 11, 17);
    int month = date.get(GregorianCalendar.MONTH);  // value of month will be 11
    * */

}
