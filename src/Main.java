import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DayOfWeekCalculator calculator = new DayOfWeekCalculatorByLocalDate();
        CalendarService calendarService = new SimpleCalendarService(calculator);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        calendarService.printCalendar(year);
    }
}