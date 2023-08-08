package homeWork;

public class Main {
    public static void main(String[] args) {
        //Во всех задачах использовать цикл For. Полученный результат вывести на экран.

        //Задача 1
        //    Написать программу, вычисляющую факториал числа 5.
        //    Факториал числа - это произведение всех целых чисел от 1 до самого числа. Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1.
        //    ! -обозначение факториала.
        System.out.println("***   Задача 1   ***");
        int num = 5;
        long factorial = 1L;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + num + "! = " + factorial);

        //Задача 2
        //  Есть массив из 10 цел%*ых чисел. Написать программу, находящую количество
        //  четных чисел в нем.
        System.out.println("***   Задача 2   ***");
        int[] randomArray = new int[10];
        int a = 1;
        int b = 100;
        int count = 0;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(randomArray[i] + " ");
            if (randomArray[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("количество четных чисел в массиве = " + count);

        //Задача 3
        //  Есть массив целых чисел. Написать программу,
        //  находящую разницу между значением максимального
        //  и минимального элементов. (max - min).
        System.out.println("***   Задача 3   ***");
        int min = randomArray[0];
        int max = randomArray[0];

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < min) {
                min = randomArray[i];
            } else if (randomArray[i] > max) {
                max = randomArray[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("Разница между значением максимального и минимального элементов массива = " + (max - min));


        //Задача 4*
        //    Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
        //  1
        //  12
        //  123
        //  1234
        //  12345
        //  123456
        System.out.println("***   Задача 4   ***");

        for (int i = 1; i <= 6; ++i) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
