package Lab04A;
import java.lang.Math;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public static int normalize(int num){
        return num/Math.abs(num);
    }
}



