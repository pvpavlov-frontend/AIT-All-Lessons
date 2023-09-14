package homework_42.src;
//** Задача 1 **
//
//Дана String с произвольным текстом (без знаков препинания слова разделены пробелом). Необходимо получить map, где ключем будет выступать первая буква слова, а значением, список слов начинающихся на эту букву


import task.src.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "Учитывая ключевые сценарии поведения высокое качество позиционных исследований позволяет оценить значение глубокомысленных рассуждений Высокий уровень вовлечения представителей целевой аудитории является четким доказательством простого факта укрепление и развитие внутренней структуры требует определения и уточнения поэтапного и последовательного развития общества В своём стремлении улучшить пользовательский опыт мы упускаем что некоторые особенности внутренней политики рассмотрены исключительно в разрезе маркетинговых и финансовых предпосылок Кстати элементы политического процесса являются только методом политического участия и объединены в целые кластеры себе подобных";


        List<String> tokens = Arrays.asList(str.split(" "));
        System.out.println(tokens);
        System.out.print(listStr(tokens)+" ");

    }

    public  static Map<Character, List<String>> listStr(List<String> tokens){
        Map<Character, List<String>> result = new TreeMap<>();
        if(tokens==null) return result;
        for (String s: tokens){
            char c = s.charAt(0);

            List<String> list = result.getOrDefault(c, new ArrayList<>());
            list.add(s);
            result.put(c, list);
        }
        return result;
    }
}
