package homework_13;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  Задача 1
//  Напишите метод, который имитирует бросание игрового кубика.
//  На вход методу подается число бросков, на выходе метод возвращает
//  результаты всех бросков.

        System.out.println("***   Задача 1   ***");
        int shot = 3;
        int[] rezArr = diceRoll(shot);
        for (int j : rezArr) {
            System.out.print(j + ", ");
        }
        System.out.println();

//  Задача 2
//  Реализуйте метод, который заполняет массив случайными буквами.
//  Размер массива подается на вход методу.

        System.out.println("***   Задача 2   ***");
        String[] rezArr2 = randomArray();
        for (String s : rezArr2) {
            System.out.print(s + ", ");
        }
        System.out.println();

//  Задание 3
//  Реализовать метод, выводящий на экран все делители введенного
//  пользователем целого числа. Вернуть массив со всеми делителями числа.

        System.out.println("***   Задача 3   ***");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        int[] rezArr3 = metodMy(n);
        for (int s : rezArr3) {
            System.out.print(s + ", ");
        }
        System.out.println();

//  Задача 4 (*)
//  Написать метод, возвращающий минимальный и максимальный элемент из
//  поданного ему на вход массива целых чисел.
        System.out.println("***   Задача 4   ***");
        int[] inputArrey = {123, 234, 34, 56, 568, 786, 789};
        int[] rezArr4 = minMaxArrey(inputArrey);
        for (int s : rezArr4) {
            System.out.print(s + ", ");
        }
    }

     static int[] diceRoll(int shot) {
        int[] arr = new int[shot];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 7);
        }
        return arr;
    }

     static String[] randomArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество случайных букв");
        int n = scanner.nextInt();
        String[] arrStr = new String[n];
        Random random = new Random();
        for (int j = 0; j < arrStr.length; j++) {
            char code = (char) (random.nextInt(97, 123));
            arrStr[j] = Character.toString(code);
        }
        return arrStr;
    }
     static int[] metodMy(int n){
        String res = "";
        for (int i = 1; i <= n; i++) {
            if(0 == (n % i)) {
                res += i+ ",";
            }
        }
        String strArr[] = res.split(",");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        return numArr;
    }

    public static int[] minMaxArrey(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] rezArrey = new int[2];
        rezArrey[0] = min;
        rezArrey[1] = max;
        return rezArrey;
    }
}
