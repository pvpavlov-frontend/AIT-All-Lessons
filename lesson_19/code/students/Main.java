package students;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jack");

        System.out.println(student1);
        student1.addRate(5);
        student1.addRate(4);
        student1.addRate(3);

        System.out.println(student1);


        System.out.println("---------------- GROUP ----------------");
        Group group31_1 = new Group();
        group31_1.add(student1);
        Student student2  = new Student("John");
        student2.addRate(5);
        group31_1.add(student2);
        student2.addRate(7);
        student2.addRate(6);
        student2.addRate(5);
        student2.addRate(9);
        student2.addRate(9);
        group31_1.add(new Student("Pavel"));
        System.out.println(group31_1);
        int[] arr = new int[3];
        Arrays.fill(arr, 1);



        /*
        SmartArray array  = new SmartArray();

        System.out.println(array);

        array.add(1);
        System.out.println(array);

        array.add(2);
        System.out.println(array);

        array.add(30);
        System.out.println(array);


        array.add(54);
        System.out.println(array);

        array.add(76);
        System.out.println(array);


        array.add(30);
        System.out.println(array);

        array.add(99);
        System.out.println(array);

        array.add(98);
        System.out.println(array);

        array.add(3);
        System.out.println(array);

        array.add(3);
        System.out.println(array);

        int[] arr= array.getArray();
        arr[0]=7777777;
        System.out.println(array);

*/

    }
}