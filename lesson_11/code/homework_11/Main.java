package homework_11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  Задача1
//  Реализуйте с помощью метода конвертор, который переводит скорость в милях в час в скорость в км/час.
//  1 миля равна 1609 метров. Метод получает на вход данные от пользователя с клавиатуры.

        System.out.println("***   Задача1   ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость в милях :");
        int speed = scanner.nextInt();
        translateSpeed(speed); //вызов метода
//  Задача2
//  Реализуйте метод sumOfArray (сумма элементов массива),
//  который получает на вход массив и определяет сумму его элементов.

        System.out.println("***   Задача2   ***");
        Random rd = new Random();
        int[] someOfArr = new int[5];
        for (int i = 0; i < someOfArr.length; i++) {
            someOfArr[i] = rd.nextInt(0, 10) + 1 ;
            System.out.print(someOfArr[i]+" ");
        }
        System.out.println();
        sumOfArray(someOfArr);//вызов метода

//  Задача3
//  Написать метод, принимающий массив целых чисел,
//  и печатающий его в обратном порядке. Сначала
//  последний элемент, потом предпоследний, и т. д.

        System.out.println("***   Задача3   ***");
        arrRevers(someOfArr);//вызов метода
        System.out.println();

//  Задача 4 (*)
//  Имеется массив данных - остатки на счетах клиентов
//  банка (задать случайными числами в интервале
//  от 10 000 до 100 000 000 д.е., количество клиентских счетов = 20).
//  Произошла деноминация, теперь 1 д.е = 100 старых д.е.
//  Рассчитайте новые остатки денег на счетах клиентов.
        System.out.println("***   Задача4   ***");
        Random random = new Random();
        double[] accountBalances = new double[20];
        for (int i = 0; i < accountBalances.length; i++) {
            accountBalances[i] = random.nextDouble( 10000, 100000000) ;
            String firstResult = String.format("%.2f", accountBalances[i]);
            System.out.print((firstResult) + " $  "); //
        }
        System.out.println();
        denomination(accountBalances);
    }
    public static void translateSpeed(double speed) {
         double km = speed * 1.609;
        System.out.print(speed);
        System.out.printf(" миль это =  %.2f" , km);
        System.out.println(" km/h");
    }
    public static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма всех чиссел массива = " + sum);
    }
    public static void arrRevers(int[]arr1) {
        System.out.println("Array :");
        for(int i = 0; i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Array reverse:");
        for(int i = arr1.length - 1; i >= 0; i--){
            System.out.print(arr1[i] + " ");
        }
    }
    public static void denomination(double[] arr2) {
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i] = arr2[i]/100;
        }
        System.out.println("Array denomination:");
        for (int i = 0; i < arr2.length; i++) {
            String firstResult = String.format("%.2f", arr2[i]);
            System.out.print((firstResult) + " €  ");
        }
    }
}
