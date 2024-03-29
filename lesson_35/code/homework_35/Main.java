package homework_35;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Задача 1
//  Написать метод, принимающий два листа целых чисел одинаковой длины
//   и возвращающий лист, содержащий элементы Yes или No, где значения
//  на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
//  Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
//  Протестировать
//
//Задача 2
//  Написать метод, принимающий лист целых чисел и целое число
//  и возвращающий лист без элементов больших этого числа.
//  Протестировать.


        List<Integer> numArr1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> numArr2 = Arrays.asList(5, 2, 3, 8);
        List<Integer> numArr3 = Arrays.asList(5, 2, 3, 6, 4, 1, 9);

        List<Integer> n1 = new ArrayList<Integer>(numArr1);
        List<Integer> n2 = new ArrayList<Integer>(numArr2);
        List<Integer> n3 = new ArrayList<Integer>(numArr3);

        System.out.println(yesOrNoNumber(n1, n2));
        listWithoutElementsGreaterNumber(n3, 2);
        listWithoutElementsGreaterNumberIterator(n3, 2);

    }

    public static List<String> yesOrNoNumber(List<Integer> list1, List<Integer> list2) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        return res;
    }
    public static List<Integer> listWithoutElementsGreaterNumber( List<Integer> l1, int num){
//        List<Integer> result = new ArrayList<>();
//        for (Integer i:l1 ) {
//            if (i <= num) {
//                result.add(i);
//            }
//        }
        List<Integer> resArrNum = new ArrayList<>();
        l1.forEach(n ->{
            if (n <= num){
                resArrNum.add(n);
            }
        });
        return resArrNum;
    }
    public static Iterator<Integer> listWithoutElementsGreaterNumberIterator( List<Integer> l1, int num){
        Iterator<Integer> iterator = l1.iterator();
        while(iterator.hasNext()){
            if (iterator.next() >= num){
                iterator.remove();
            }
        }
        return iterator;
    }
}