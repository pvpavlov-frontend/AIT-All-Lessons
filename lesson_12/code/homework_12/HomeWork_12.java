package homework_12;

import java.util.Random;

public class HomeWork_12 {
    public static void main(String[] args) {
//  Задача 1
//  Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
//  Пример : Hello-> EL
//  В методе main() вывести получившийся результат на экран
        System.out.println("***   Задача 1   ***");
        System.out.println(changeText("Hello!"));

//  Задача 2
//  Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1. Если да, метод возвращает true,
//  если нет false.
//  static boolean checkOnesAndZeros( int[] ints)
//  В методе main() вывести получившийся результат на экран
        System.out.println("***   Задача 2   ***");
        Random rd = new Random();
        int[] someOfArr = new int[3];
        System.out.println("В массиве целых чисел: ");
        for (int i = 0; i < someOfArr.length; i++) {
            someOfArr[i] = rd.nextInt(-3, 3);
            System.out.print(someOfArr[i] + " ");
        }
        System.out.println();
        System.out.println("содержатся ли числa 0 или -1\n" + checkOnesAndZeros(someOfArr));
        checkOnesAndZeros(someOfArr);
//  Задача 3
//  Написать метод, принимающий массив целых чисел и число и
//  находящий индекс этого числа(элемента) в массиве.
//  Если такой элемент есть, возвращается его индекс, если нет, метод возвращает -1.
//  В методе main() вывести получившийся результат на экран
        System.out.println("***   Задача 3   ***");
        System.out.println("индекс переданного числа = " + searchIndex(someOfArr, 2));
    }

    static String changeText(String str) {
        return str.substring(1, 3).toUpperCase();
    }

    static boolean checkOnesAndZeros(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == -1 || ints[i] == 0)
                return true;
        }
        return false;
    }

    static int searchIndex(int[] a, int index) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == index) {
                return i;
            }
        }
        return -1;
    }
}
