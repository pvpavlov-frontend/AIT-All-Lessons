package homework_55;

//Создать двумерный массив 5x3 т.е. 5 строк 3 столбца. Заполнить его случайными числпми.
//
//  Написать метод, который преобразует его в одномерный массив из 15 элементов, перенося числа по-порядку (слева направо и сверху вниз) из исходного
//  Написать метод, который меняет все значения из первой строки, на соответствующие значения из 3 строки, а значения из третьей строки на значения из первой. Т.е. в итоге нужно поменять местами первую и третью строки исходного массива.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[][] twoDimArray = createTwoDimensionalArray(5, 3, 3);
        print(twoDimArray);
        System.out.println("=======================================");
        List<Integer> result = Main.toSnakeArray(twoDimArray);
        System.out.println(Arrays.toString(result.toArray()));
        System.out.println("=======================================");
        print(changeLines(twoDimArray));
    }

    private static void print(Integer[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static Integer[][] createTwoDimensionalArray(int array_line, int array_length, int rand_step) {
        int array_min, array_max, numb;
        boolean in_array = true;
        Integer[][] twoDimArray = new Integer[array_line][array_length];
        for(int i = 0; i < array_line; i++){
            for(int j = 0; j < array_length; j++) {
                // рандж для гпсч от и до для каждой колонки
                array_max = rand_step * (j + 1);
                array_min = array_max - rand_step;
                do {
                    in_array = false;
                    // создаём случайное число
                    numb = (int) (Math.random() * ((array_max - array_min) + 1)) + array_min;
                } while(in_array);
                twoDimArray[i][j] = numb;
            }
        }
        return twoDimArray;
    }
    private static <T> List<T> toSnakeArray(T[][] array) {
        final List<T> result = new ArrayList<>();
        for (T[] arrays : array) result.addAll(Arrays.asList(arrays));
        return result;
    }
    private static Integer[][] changeLines(Integer[][] array1){
        for (Integer i = 0; i < array1[0].length; i++) {
            int temp = array1[0][i];
            array1[0][i] = array1[2][i];
            array1[2][i] = temp;
        }
        return array1;
    }
}
