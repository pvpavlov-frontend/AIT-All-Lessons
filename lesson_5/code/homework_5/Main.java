package homework_5;

public class Main {
    public static void main(String[] args) {
//Задача 1
//  Есть строка четной длины. Написать программу, выводящую на экран первую половину этой строки.
//  Пример: есть Hell , результат He
        String str = "Hell";
        System.out.println( str.substring(0,str.length()/2));


//Задача 2
//  Есть две переменные целого типа. Написать программу, выводящую на экран true если значение одной из переменных = 10 или сумма значение переменных равна 10. Иначе на экран выводится false.
//  Пример: int a = 10, int b = 9 -> true
//  int a = 1 , int b = 9 -> true
//  int a = 4 , int b = 10 -> true
//  int a = 4 , int b = 3 -> false
        int a = 4;
        int b = 3;
        System.out.println(a == 10 || b == 10 || a + b == 10);
        System.out.println();
    }
}
