import java.util.LinkedList;
import java.util.GregorianCalendar;

/**
 * a program that reports weather trends.
 */
public class WeatherMonitor {
    private IReportSet reports;

    public WeatherMonitor(IReportSet reports) {
        this.reports = reports;
    }


    /**
     * average daily temperature during a particular month and year.
     * @param month a month[0,11] where 0 is January and 11 is December.
     * @param year a year.
     * @return the average temperature for all days in a specified month in a given year.
     */
    public double averageTempForMonth(int month, int year) {
        return this.reports.getAverageTempForMonth(month, year);
    }


    /**
     * total rainfall during a particular month and year.
     * @param month a month[0,11] where 0 is January and 11 is December and a year.
     * @param year a year.
     * @return the total rainfall for all days in a specified month in a given year.
     */
    public double totalRainfallForMonth(int month, int year) {
        return this.reports.getTotalRainfallForMonth(month, year);
    }


    /**
     * Adds a DailyWeatherReport to the data structure storing DailyWeatherReports.
     * ASSUME: a daily report for the provided date does not already exist.
     * @param date an instance of the GregorianCalender class representing a date.
     * @param readings  a list of readings (for that date).
     * @return creates and stores a daily report for that given date.
     */
    public IReportSet addDailyReport(GregorianCalendar date,
                                     LinkedList<Reading> readings) {

        //        I almost think that this method should return void.
        LinkedList<Double> temps = new LinkedList<>();
        LinkedList<Double> rainfalls = new LinkedList<>();

        for(Reading aReading: readings) {
            temps.add(aReading.getTemp());
            rainfalls.add(aReading.getRainfall());
        }

        DailyWeatherReport aNewDailyWeatherReport = new DailyWeatherReport(date, temps, rainfalls);
        return this.reports.setAddDailyReport(aNewDailyWeatherReport);
    }

}
