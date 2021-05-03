import java.util.GregorianCalendar;
import java.util.LinkedList;

// i like big butts and I cannot lie
public interface IReportSet {
     double getAverageTempForMonth(int month, int year);
     double getTotalRainfallForMonth(int month, int year);
     IReportSet setAddDailyReport(DailyWeatherReport aNewDailyWeatherReport);
}
