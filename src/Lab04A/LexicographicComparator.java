package Lab04A;
import java.util.Comparator;
import java.lang.Math;
public class LexicographicComparator implements Comparator<Person>{

    public int compare(Person arg0, Person arg1){
        {
            String name0 = arg0.getName();
            String name1 = arg1.getName();

            for (int i = 0; i < name0.length() &&
                    i < name1.length(); i++) {
                if ((int)name0.charAt(i) ==
                        (int)name1.charAt(i)) {
                    continue;
                }
                else {
                    return (arg0.normalize((int)name0.charAt(i) -
                            (int)name1.charAt(i)));
                }
            }

            if (name0.length() < name1.length()) {
                return (Person.normalize(name0.length()-name1.length()));
            }
            else if (name0.length() > name1.length()) {
                return (name0.length()-name1.length());
            }

            else {
                return 0;
            }
        }
    }
}
