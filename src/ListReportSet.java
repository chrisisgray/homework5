import java.util.GregorianCalendar;
import java.util.LinkedList;

public class ListReportSet implements IReportSet {
    private LinkedList<DailyWeatherReport> reports;

    public ListReportSet(LinkedList<DailyWeatherReport> reports) {
        this.reports = reports;
    }

    public ListReportSet() {
        this.reports = new LinkedList<DailyWeatherReport>();
    }

    public double getAverageTempForMonth(int month, int year) {
        double sumOfTemp = 0;
        int counter = 0;

        for(DailyWeatherReport aDailyReport: reports) {
            // perform operations elsewhere
            sumOfTemp += aDailyReport.getSumOfTemp(month, year);
            counter += aDailyReport.getCountOfTemp(month, year);
        }

        return sumOfTemp / counter;
    }

    public double getTotalRainfallForMonth(int month, int year) {
        double sumOfRainfall = 0;

        for (DailyWeatherReport aDailyReport : reports) {
            sumOfRainfall += aDailyReport.getSumOfRainfall(month, year);
        }
        return sumOfRainfall;
    }


    public IReportSet setAddDailyReport(DailyWeatherReport aNewDailyWeatherReport) {
        this.reports.add(aNewDailyWeatherReport);
        return this;
    }
}
