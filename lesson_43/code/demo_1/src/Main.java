package demo_1.src;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        TreeMap<Integer, String> map = new TreeMap<>();


        set.add(1);
        set.add(-1);
        set.add(-131);
        set.add(65);
        set.add(20);
        set.add(4);


        map.put(1,"1");
        map.put(-10,"-10");
        map.put(5, "5");

        System.out.println(map);


    }
}