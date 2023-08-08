package homeWork_10;

import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        //    Задача1
        //    Написать программу, которая принимает с клавиатуры имя , фамилию и возраст (Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:
        //    First name: John
        //    Last name: Smith
        //    Age: 25
        String name, surname;
        int age = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Enter your last name ");
        surname = scanner.nextLine();
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("First name: " + name);
        System.out.println("Last name: " + surname);
        System.out.println("Age: " + age);

        //    Задача2
        //    Оформить решение задачи 1 про факториал и задачи 4 про треугольник из предыдущего домашнего задания в виде методов
        factorial();

        //    Задача3
        //    Написать метод для перевода градусов по фаренгейту в шкалу цельсия. Формула для расчета С = 5*(F-32)/9. Результат вывести на экран
        fahrenheitToCelsius();
    }
    static void factorial(){
        int num = 5;
        long factor = 1L;
        for (int i = num; i > 0; i--) {
            factor *= i;
        }
        System.out.println("Факториал числа " + num + "! = " + factor);
    }
    static void fahrenheitToCelsius(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        int far = scanner.nextInt();
        double c = 5*(far-32)/9;
        System.out.println(far+" Fahrenheit = "+ c +" Celsius");
    }
}
