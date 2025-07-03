import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekCalculatorByLocalDate implements DayOfWeekCalculator {

        @Override
        public DayOfWeek calculate(int year, int month, int day) {
            return LocalDate.of(year, month, day).getDayOfWeek();
        }
    }