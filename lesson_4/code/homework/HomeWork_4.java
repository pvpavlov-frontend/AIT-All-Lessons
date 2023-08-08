package homework;

public class HomeWork_4 {
    public static void main(String[] args) {
        //Задача 1
        //Написать программу, вычисляющую и выводящую на печать ASCII значение символа 'B'.
        int ch = 'B';
        System.out.println(ch);
        //
        //Задача 2
        //Даны две строки а и в. Написать программу, соединяющую их и выводящую на экран в виде abba,
        //Например "Hi" и "Bye" должны быть напечатаны как HiByeByeHi
        String a = "a";
        String b = "b";
        System.out.println(a+b+b+a);

        a = "Hi";
        b = "Bye";
        System.out.println(a+b+b+a);
        //
        //Задача 3
        //Написать прогрмму, выводящую на экран символ строки с индексом 2.
        //Например, если строка Java, то результат будет 'v'

        String num = "Java";
        System.out.println(num.charAt(2));
        //
        //Задача 4
        //Написать программу, выводящую на экран целое число, равное двойной длине строки. Т.е. если есть строка Java, то ответ будет 8
        String str = "Java";
        System.out.println(str.length()*2);
        int y = 4;
        System.out.println("x равен = " + y);
        y *= y;
        System.out.println("x равен = " + y);
        y++;
        System.out.println("x равен = " + y);
    }
}