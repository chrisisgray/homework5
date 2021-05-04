import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.LinkedList;


public class Examples {

    public Examples() { }

    @Before
    public void executedBeforeEach() {
        IReportSet input = new ListReportSet();
        WeatherMonitor aWeatherMonitor = new WeatherMonitor(input);
        LinkedList<Reading> ListOfReadings = new LinkedList<Reading>();

        GregorianCalendar date = new GregorianCalendar(2012, 4, 24);
        Reading aReading = new Reading(new Time(1, 0), .12, 46.6);
        Reading aReading1 = new Reading(new Time(2, 0), .22, 26.6);
        Reading aReading2 = new Reading(new Time(3, 0), .32, 36.6);

        LinkedList<Double> LinkedListTemp = new LinkedList<Double>();//temp
        LinkedListTemp.add(aReading.getTemp());
        LinkedListTemp.add(aReading1.getTemp());
        LinkedListTemp.add(aReading2.getTemp());

        LinkedList<Double> LinkedListRainfall = new LinkedList<Double>();//rainfall
        LinkedListRainfall.add(aReading.getRainfall());
        LinkedListRainfall.add(aReading1.getRainfall());
        LinkedListRainfall.add(aReading2.getRainfall());

        DailyWeatherReport aDailyWeatherReport = new DailyWeatherReport(date, LinkedListTemp, LinkedListRainfall);
        ListOfReadings.add(aReading);
        ListOfReadings.add(aReading1);
        ListOfReadings.add(aReading2);

        input.setAddDailyReport(aDailyWeatherReport);
    }

    @Test
    public void totalRainfallForMonthTest() {
        IReportSet input = new ListReportSet();
        WeatherMonitor aWeatherMonitor = new WeatherMonitor(input);
        LinkedList<Reading> ListOfReadings = new LinkedList<Reading>();

        GregorianCalendar date = new GregorianCalendar(2012, 4, 24);
        Reading aReading = new Reading(new Time(1, 0), .12, 46.6);
        Reading aReading1 = new Reading(new Time(2, 0), .22, 26.6);
        Reading aReading2 = new Reading(new Time(3, 0), .32, 36.6);

        LinkedList<Double> LinkedListTemp = new LinkedList<Double>();//temp
        LinkedListTemp.add(aReading.getTemp());
        LinkedListTemp.add(aReading1.getTemp());
        LinkedListTemp.add(aReading2.getTemp());

        LinkedList<Double> LinkedListRainfall = new LinkedList<Double>();//rainfall
        LinkedListRainfall.add(aReading.getRainfall());
        LinkedListRainfall.add(aReading1.getRainfall());
        LinkedListRainfall.add(aReading2.getRainfall());

        DailyWeatherReport aDailyWeatherReport = new DailyWeatherReport(date, LinkedListTemp, LinkedListRainfall);
        ListOfReadings.add(aReading);
        ListOfReadings.add(aReading1);
        ListOfReadings.add(aReading2);

        input.setAddDailyReport(aDailyWeatherReport);

        assertEquals(109.8, aWeatherMonitor.totalRainfallForMonth(4, 2012), 0.1);


    }

    @Test
    public void averageTempForMonthTest() {
        IReportSet input = new ListReportSet();
        WeatherMonitor aWeatherMonitor = new WeatherMonitor(input);
        LinkedList<Reading> ListOfReadings = new LinkedList<Reading>();

        GregorianCalendar date = new GregorianCalendar(2012, 4, 24);
        Reading aReading = new Reading(new Time(1, 0), .12, 46.6);
        Reading aReading1 = new Reading(new Time(2, 0), .22, 26.6);
        Reading aReading2 = new Reading(new Time(3, 0), .32, 36.6);

        LinkedList<Double> LinkedListTemp = new LinkedList<Double>();//temp
        LinkedListTemp.add(aReading.getTemp());
        LinkedListTemp.add(aReading1.getTemp());
        LinkedListTemp.add(aReading2.getTemp());

        LinkedList<Double> LinkedListRainfall = new LinkedList<Double>();//rainfall
        LinkedListRainfall.add(aReading.getRainfall());
        LinkedListRainfall.add(aReading1.getRainfall());
        LinkedListRainfall.add(aReading2.getRainfall());

        DailyWeatherReport aDailyWeatherReport = new DailyWeatherReport(date, LinkedListTemp, LinkedListRainfall);
        ListOfReadings.add(aReading);
        ListOfReadings.add(aReading1);
        ListOfReadings.add(aReading2);

        input.setAddDailyReport(aDailyWeatherReport);

        assertEquals(.22, aWeatherMonitor.averageTempForMonth(4, 2012), 0.1);
    }


}





