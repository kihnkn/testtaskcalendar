import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class SimpleCalendarService extends CalendarService {

    public SimpleCalendarService(DayOfWeekCalculator calculator) {
        super(calculator);
    }

    @Override
    protected void printMonthLabel(Month month) {
        String monthName = month.getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault());
        String monthLabel = monthName.substring(0, 1).toUpperCase(Locale.getDefault()) + monthName.substring(1);
        System.out.println("  " + monthLabel);
    }

    @Override
    protected void printDaysOfMonth(int startDayNumber, int countDays) {
        printDaysOfWeek();

        for (int i = 1; i < startDayNumber; i++) {
            System.out.printf("%4s", "");
        }

        for (int currentDay = 1; currentDay <= countDays; currentDay++) {
            System.out.printf("%4d", currentDay);
            if ((startDayNumber + currentDay - 1) % 7 == 0) {
                if (currentDay != countDays) System.out.println();
            }
        }
        System.out.println();
    }

    private void printDaysOfWeek() {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.printf("%4s", day.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
        }
        System.out.println();
    }
}