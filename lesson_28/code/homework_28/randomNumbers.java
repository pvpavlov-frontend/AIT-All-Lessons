package homework_28;

public class randomNumbers {
    public static void main(String[] args) {
    //Задача 1. Задайте массив на 10 элементов и заполните его случайными числами в интервале от -10 до 10.
    //Распечатайте полученный массив. Создайте метод, который определяет наличие дубликатов в массиве.
    //Разработайте соответсвующий тест (набор тестов).
        int[] array = new int[10];
        int a = -10;
        int b = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(array);
        System.out.println();
        detectDuplcate(array);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    public static int[] detectDuplcate (int[] myArray) {
        for(int i=0; i<myArray.length; i++) {
            for (int j=i+1; j<myArray.length; j++) {
                if(myArray[i] == myArray[j]) {
                    System.out.println("Дублируються: " + j);
                }
            }
        }
        return myArray;
    }
}
