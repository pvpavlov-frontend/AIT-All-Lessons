package homework_16;

public class Main {
    public static void main(String[] args) {

//  Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
        NewDate newDate1 = new NewDate();
        newDate1.day=14;
        newDate1.month=5;
        newDate1.year=1980;


        NewDate newDate2 = new NewDate();
        newDate2.day=7;
        newDate2.month= 9;
        newDate2.year=1984;


        NewDate startCourse1 = new NewDate();
        startCourse1.day = 1;
        startCourse1.month = 1;
        startCourse1.year = 2020;

        NewDate startCourse2 = new NewDate();
        startCourse2.day = 10;
        startCourse2.month = 11;
        startCourse2.year = 2021;

        Student student1 = new Student();
        student1.firstName = "Anton";
        student1.lastName = "Olenev";
        student1.birthday = newDate1;
        student1.group = "31.1";
        student1.startCourse = startCourse1;
        printStudent(student1);
        System.out.println();

        Student student2 = new Student();
        student2.firstName = "Pavel";
        student2.lastName = "Pavlov";
        student2.birthday = newDate2;
        student2.group = "31.2";
        student2.startCourse = startCourse2;
        printStudent(student2);
        System.out.println();

        Haus haus = new Haus();
        haus.numberOfStoreys = 1;
        haus.streetName = "Elbe Strasse";
        haus.city = "Berlin";
        haus.individual = true;
        haus.number = 14;
        printHaus(haus);
        System.out.println();

        Haus haus1 = new Haus();
        haus1.numberOfStoreys = 16;
        haus1.streetName = "Hafen Strasse";
        haus1.city = "Bremen";
        haus1.individual = false;
        haus1.number = 90;
        printHaus(haus1);
        System.out.println();
     }
    public static  void printStudent(Student stud){
        System.out.println("firstName: " + stud.firstName + "\n" + "lastName: " + stud.lastName + "\n" + "birthday: " + dataToString(stud.birthday) + "\n" + "group: " + stud.group + "\n" + "startCourse: " + dataToString(stud.startCourse));
    }
    public static String dataToString(NewDate date){
        if (date.month<0 || date.month>12){ return "error"; }

        String [] months = { "", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        return (date.day<10?"0":"")  + date.day +"." +  months[date.month] +"."+ date.year;

    }

    public static void printHaus(Haus hau) {
        System.out.println("city: " + hau.city +"\n" + "streetName: "+ hau.streetName +"\n"+ "number: " + hau.number + "\nnumberOfStoreys: "  + hau.numberOfStoreys + "\nindividual: " + hau.individual);
    }


}
