package homework_60;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <Alcohol> alcohol = List.of(
                new Alcohol("Vodka", 40.0, 6.40),
                new Alcohol("Whiskey", 42.0, 60.10),
                new Alcohol("Wine", 12.0, 3.60),
                new Alcohol("Vodka", 40.0, 6.40),
                new Alcohol("Beer", 5.5, 1.80),
                new Alcohol("Beer", 5.5, 1.80),
                new Alcohol("Gin", 38, 16.40)
        );
        System.out.println("Задание 1 ⭐⭐");
//        Задание 1 ⭐⭐
//        Получите LinkedList из топ 3 самых дорогих товаров.
        LinkedList<Alcohol> alcoholLinkedList = alcohol.stream()
                .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice()))
                .limit(3)
                .collect(
                        Collectors
                                .toCollection(LinkedList::new));
        System.out.println(alcoholLinkedList);
        System.out.println("Задание 2⭐⭐");
//        Задание 2 ⭐⭐
//        Получите самый дешевый товар
        Optional<Alcohol> cheapestAlcohol = alcohol.stream()
                .sorted((b, a) -> Double.compare(b.getPrice(), a.getPrice()))
                .findFirst();
        System.out.println(cheapestAlcohol);
        System.out.println("Задание 3 ⭐⭐");
//        Задание 3 ⭐⭐
//        Создайте Set из исходного листа.
        Set<Alcohol> uniqueListOfAlcohol = new HashSet<Alcohol>(new HashSet<>(alcohol));;


        System.out.println(uniqueListOfAlcohol);
        System.out.println("Задание 4 ⭐⭐⭐");
//        Задание 4 ⭐⭐⭐
//        Создайте Map из исходного листа, в котором ключами будут -
//        названия товаров, а значениями будут цены.
        Map<String, Set<Double>> alcoholMap = alcohol.stream().collect
                (Collectors.groupingBy(Alcohol::getTitle,
                        Collectors.mapping(Alcohol::getPrice,
                                Collectors.toSet())));
        System.out.println(alcoholMap);
        System.out.println("Задание 5 ⭐⭐⭐");

//        Задание 5 ⭐⭐⭐
//        Создайте Map из исходного листа, в котором ключами будут -
//        названия товаров, а значениям будет крепость.
//
        Map<String, Set<Double>> alcoholMap1 = alcohol.stream()

                .collect(Collectors.groupingBy(Alcohol::getTitle,
                        Collectors.mapping(Alcohol::getStrength,
                                Collectors.toSet())));
        System.out.println(alcoholMap1);
    }
}
