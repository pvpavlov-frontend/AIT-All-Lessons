package homework_61.src;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws ParseException {
//  Задача 1
//  Создайте класс Person, c полями имя(стринг) и дата рождения(Date),
//  которому при создании передавайте имя и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".
//  Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

        Date birthdayBob1 = new GregorianCalendar(2017, Calendar.JANUARY , 25).getTime();
        Date birthdayBob2 = new GregorianCalendar(1917, Calendar.JANUARY , 25).getTime();
        String birthdayBob1String = formatter.format(birthdayBob1);
        String birthdayBob2String = formatter.format(birthdayBob2);

        System.out.println(birthdayBob1String);
        System.out.println(birthdayBob2String);
        Date bob1 = new Person("Bob1", birthdayBob1).getBirthday();
        Date bob2 = new Person("Bob2", birthdayBob2).getBirthday();
        System.out.println(bob1);
        System.out.println(bob2);

        System.out.println(bob1.before(bob2));
        System.out.println(bob1.equals(bob2));
        System.out.println(bob1.after(bob2));

        System.out.println(bob1.compareTo(bob2));
        System.out.println(bob2.compareTo(bob1));
    }
}
