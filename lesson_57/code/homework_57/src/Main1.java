package src;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main1 {
    public static void main(String[] args) {
        Person p1= new Person("John", "Lankaster", "lankaster@gmail.com", "+34569996633", new Address("23456","Berlin", "qwestrasse", "34"));
        Person p2= new Person("David", "Gunar", "Gunar@gmail.com", "+34564443377", new Address("66666","Munchen", "110 strasse", "1"));
        Person p3= new Person("Jastin", "Trudo", "Trudo@gmail.com", "+44568886644", new Address("33333","Bremen", "Bremen strasse", "3"));
        Person p4= new Person("Sendra", "Sharp", "Sharp@gmail.com", "+133385769922", new Address("12001","Dublin", "manchester strasse", "777"));
        Person p5= new Person("Viktoria", "Agelera", "Agelera@gmail.com", "+9876 1235566", new Address("65234","Barselona", "Ferguson strasse", "138"));
        System.out.println(p1);
        List<Person> people = List.of(p1,p2,p3,p4,p5);
//        System.out.println("----- firstName lastName ----");
//        people.forEach(s-> System.out.println(s.getfName()+" "+s.getlName()));
//        System.out.println("----- email ----");
//        people.forEach(s-> System.out.println(s.getEmail()));
//        System.out.println("----- phone ----");
//        people.forEach(s-> System.out.println(s.getPhone()));
//        System.out.println("----- address ----");
//        people.forEach(s -> System.out.println(s.getAddress()));

//        List<String> allName = (List<String>) handler(people, );

    }

    private static <T> Object handler(List<T> list, Function<T,T> ttFunction) {
        List<T> res= new ArrayList<>();
        for (T el:list) {
            res.add(ttFunction.apply(el));
        }
        return res;
    }

//    public static <T> List<T> handler1(List<T> list, Predicate<T> predicate){
//        List<T> res= new ArrayList<>();
//        for (T el:list) {
//            if(predicate.test(el)) res.add(el);
//        }
//        return res;
//    }
}
