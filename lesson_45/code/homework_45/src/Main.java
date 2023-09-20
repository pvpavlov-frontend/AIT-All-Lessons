package homework_45.src;

//** Задача 1 **
//
//        Дана строка - скобочная последовательность ( строка состоящая из скобок трех видов *() [] {} ) Написать метод (алноритм обсуждали в классе) который проверит прпвилтность расстановки скобок.
//
//        ( {} [] ) -> true
//
//        ( {} [ ) -> false
//
//        ( } [] ) -> false
//
//        { ( } [] ) -> false

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValidBreckets("({[]})")); // true
        System.out.println(isValidBreckets(""));       // true
        System.out.println(isValidBreckets("({[]}"));  // false
        System.out.println(isValidBreckets("({]})"));  // false
        System.out.println(isValidBreckets("({[{]})"));// false
    }

    private static boolean isValidBreckets(String brecketStr) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (Character c: brecketStr.toCharArray()) {
            if (brackets.containsValue(c)){
                stack.push(c);
            } else if (brackets.containsKey(c)){
                if (stack.isEmpty() || stack.pop() != brackets.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
