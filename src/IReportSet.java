import java.util.GregorianCalendar;
import java.util.LinkedList;

// i like big butts and I cannot lie
public interface IReportSet {
    public double getAverageTempForMonth(int month, int year);
    public double getTotalRainfallForMonth(int month, int year);
    public IReportSet setAddDailyReport(DailyWeatherReport aNewDailyWeatherReport);
}
