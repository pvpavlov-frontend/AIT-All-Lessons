package demo20231005_1.src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
    }
    public void temp(List<Person> list){
        Comparator<Person> comparatorPerson2 = new Comparator<>() {
            /**
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             * @return
             */
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };
        ComparatorPerson comparatorPerson = new ComparatorPerson();
        list.sort(comparatorPerson2);
        list.sort( (o1, o2) -> { return  o1.getAge() - o2.getAge();} );

        /*  list.sort(new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                    return o1.getAge()- o2.getAge();
            }
        });*/

    }
}
