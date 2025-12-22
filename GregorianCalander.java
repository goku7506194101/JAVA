import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalander {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println("Current Date and Time: " + calendar.getTime());

        int year = calendar.get(Calendar.YEAR);
        System.out.println("Current Year: " + year);

        if (calendar.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}