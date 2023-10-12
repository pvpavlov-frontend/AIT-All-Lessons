package homework_61.src;

import java.util.Date;

public class Person implements Comparable<Person>{
    private String name;
    private Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", birthday=" + birthday +
            '}';
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Person o) {
        return this.birthday.compareTo(o.birthday);
    }
}
