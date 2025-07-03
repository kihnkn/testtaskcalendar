import java.time.Month;
import java.time.Year;

public abstract class CalendarService {

    private final DayOfWeekCalculator dayOfWeekCalculator;

    public CalendarService(DayOfWeekCalculator calculator) {
        this.dayOfWeekCalculator = calculator;
    }

    public void printCalendar(int year) {
        for (Month month : Month.values()) {
            printMonthLabel(month);

            int startDayNumber = dayOfWeekCalculator.calculate(year, month.getValue(), 1).getValue();
            int countDays = month.length(Year.isLeap(year));

            printDaysOfMonth(startDayNumber, countDays);
            System.out.println();
        }
    }

    protected abstract void printMonthLabel(Month month);

    protected abstract void printDaysOfMonth(int startDayNumber, int countDays);
}