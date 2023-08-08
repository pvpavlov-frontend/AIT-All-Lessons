package homework;

public class HomeWork_8 {
    public static void main(String[] args) {
//  Задача 1
//  Собрать в массив данные о росте (или возрасте) членов группы. Выведите на печать максимальное и минимальное значение.
        System.out.println("*** Максимальное и Минимальное значение Роста членов группы ***");
        int i = 0;
        int[] heightArr = {150, 140, 165, 178, 195, 165, 155, 99, 179, 180, 150, 199, 165, 178, 195, 165, 155, 156, 179, 210};
//        System.out.println(heightArr.length);
        int min = heightArr[0];
        int max = heightArr[0];
        if (heightArr != null) {
            while (i < heightArr.length) {

                if (heightArr[i] < min) {
                    min = heightArr[i];
                } else if (heightArr[i] > max) {
                    max = heightArr[i];
                }
                i++; // увеличиваем индекс
            }
            System.out.println("min = " + min + "см");
            System.out.println("max = " + max + "см");
        }

//  Задача 2
//  Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38. Найдите максимальный элемент массива и его индекс.
        System.out.println();
        System.out.println("*** Найдим максимальный элемент массива и его индекс ***");
        int[] MyArray = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int j = 0;
        int maximum = MyArray[0];
        int pointer = 0;

        while (j < MyArray.length) {
            System.out.print(MyArray[j] + ", ");
            if (MyArray[j] > maximum) {
                maximum = MyArray[j];
                pointer = j;
            }
            j++;
        }
        System.out.println();
        System.out.println("Max = " + maximum + ", \nindex = " + pointer);
//  Задача 3
//  Создайте массив из 20 случайных целых чисел в интервале от 10 до 20. Выведите массив на печать. Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.
        System.out.println();
        System.out.println("*** Создаем массив из 20 случайных целых чисел ***");
        int[] randomArray = new int[20];
        int a = 10;
        int b = 20;

        int z = 0;
        int y = 0;

        while (z < randomArray.length) {
            randomArray[z] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(randomArray[z] + ", ");
            z++;
        }
        System.out.println();
        int first = randomArray[0];
        int last = randomArray[randomArray.length - 1];
        randomArray[randomArray.length - 1] = first;
        randomArray[0] = last;
        while (y < randomArray.length) {
            System.out.print(randomArray[y] + ", ");
            y++;
        }

//  Задача 4(*)
//  Создайте массив, содержащий в себе название карточных мастей. Создайте массив, содержащий в себе карты от двойки до туза. Раздайте из колоды по 6 карт на 4 игрока.
    }
}
