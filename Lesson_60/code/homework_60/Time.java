package homework_60;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2018, 11, 13);
        Date current = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM dd");
        String currentAsString = formatter.format(current);
        System.out.println(currentAsString);
    }
}
