package demo20231004_1.src;


import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID = 2L;
    private String name;
    private int age;
    private int temp;
    private int temp1;
    private transient Car car;


    public Person(String name, int age, int temp, int temp1, Car car) {
        this.name = name;
        this.age = age;
        this.temp = temp;
        this.temp1 = temp1;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
