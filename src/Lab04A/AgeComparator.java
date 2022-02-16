package Lab04A;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    public int compare(Person arg0, Person arg1) {
        int age0 = arg0.getAge();
        int age1 = arg1.getAge();

          return arg0.normalize(age0-age1);
    }
}
