package demo20231005_1.src;

import java.util.Comparator;

public class ComparatorPerson implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()- o2.getAge();
    }
}
