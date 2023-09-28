package day8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }
    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}
public class SortAge {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Chakitha", 23));
        people.add(new Person("Vishnu Priya", 21));
        people.add(new Person("Pragathi", 18));
        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
