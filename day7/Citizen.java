package day7;
import java.util.Objects;
public class Citizen {
    private String name;
    private int age;
    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Override equals() method to compare Person objects based on name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Citizen person = (Citizen) obj;
        return age == person.age && Objects.equals(name, person.name);
    }
    // Override toString() method to provide a custom string representation
    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
    // Override hashCode() method to generate a hash code based on name and age
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    public static void main(String[] args) {
        Citizen person1 = new Citizen("Alice", 30);
        Citizen person2 = new Citizen("Bob", 25);
        Citizen person3 = new Citizen("Alice", 30);
        // Using overridden equals() method for comparison
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // false
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // true
        // Using overridden toString() method for string representation
        System.out.println("person1: " + person1); // Person{name='Alice', age=30}
        // Using overridden hashCode() method for generating hash codes
        System.out.println("person1.hashCode(): " + person1.hashCode()); // Example output: -1013090125
        System.out.println("person2.hashCode(): " + person2.hashCode()); // Example output: -1960164663
        System.out.println("person3.hashCode(): " + person3.hashCode()); // Example output: -1013090125
    }
}