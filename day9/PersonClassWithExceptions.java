package day9;
public class PersonClassWithExceptions {
    private String name;
    private int age;
    public PersonClassWithExceptions(String name, int age) throws IllegalArgumentException {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        try {
        	PersonClassWithExceptions person1 = new PersonClassWithExceptions("Chakki", 23);
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            PersonClassWithExceptions person2 = new PersonClassWithExceptions("Baby", -1); 
        } catch (IllegalArgumentException e) {
            System.err.println("Person2's age is invalid " + e.getMessage());
        }
    }
}
