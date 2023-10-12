package homework_62.src;

//Задача 1 ⭐⭐⭐⭐
//    Создайте класс Conference - с полями:

//    тема String
//    время LocalDateTime
//    ссылка на приглашение String В конструкторе конференции нужно принимать отдельно две строки:
//    date - в формате "dd-MM-yyyy",
//    time - в формате "HH-mm"
//    и остальную необходимую информацию
//    Создайте лист конференций и отсортируйте их по возрастанию (от ближайших к тем которые только будут).

//Задача 2 (Дополнительная) ⭐⭐⭐
//    Создайте метод, который принимает две даты LocalDate, а возвращает строку,
//    сколько времени между ними пройдет.
//
//    Например: "10 years, 2 months, 3 days"
//
//    Используйте класс Period
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ⭐⭐⭐⭐");
        List <Conference> conferences = List.of(
            new Conference("theme1","19-10-2023", "09-30","http:21"),
            new Conference("theme4","30-10-2023", "09-30","http:12"),
            new Conference("theme3","25-10-2023", "09-30","http:14"),
            new Conference("theme2","21-10-2023", "09-30","http:17")
        );
        List<Conference> orderedConference = conferences.stream()
            .sorted()
            .toList();
        System.out.println(orderedConference);
        System.out.println("Задача 2 ⭐⭐⭐");
        LocalDate date1 = LocalDate.of(2018, 07, 18);
        LocalDate date2 = LocalDate.of(2023, 10, 12);
        System.out.println(timeInterval(date1, date2));
    }
    public static String timeInterval(LocalDate date1, LocalDate date2 ){
        Period period = Period.between(date1, date2);
        return period.getYears() + " years, "+ period.getMonths()+ " months, "+period.getDays()+ " days";
    }

}
