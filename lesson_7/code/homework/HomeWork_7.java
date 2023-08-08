package homework;

public class HomeWork_7 {
    public static void main(String[] args) {
        //    Задача1
        //    С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n
        //    Пример:для числа n=3
        //      1 в кубе 1
        //      2 в кубе 8
        //      3 в кубе 27
        System.out.println("----- Задача_1 ------");
        int i = 1;
        int n = 3;
        while (i <= n){
            System.out.println(i + " в кубе " + i * i * i);
              i++;
        }

        //    Задача2
        //    С помощью цикла while написать программу, выводящую на экран результат умножения данного цисла n на все целые числа от 0 до n
        //    Пример: для числа 3 результат будет 0, 3, 6, 9
        System.out.println("----- Задача_2 ------");
        int j = 0;
        int num = 1;
        while (j <= num){
            System.out.println("для числа " + num + " результат будет " + j * num + ",");
            j++;
        }
    }
}
