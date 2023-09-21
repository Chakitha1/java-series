package day5;
class Person {
    protected String name, email;  
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void print() {
        System.out.println(this.name);
        System.out.println(this.email);
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class StudentSubClass extends Person {
    protected int studentID;
    public StudentSubClass(String name, String email, int studentID) {
        super(name, email);
        this.studentID = studentID;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Student ID: " + studentID);
    } 
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
public class Main {
    public static void main(String[] args) {
        StudentSubClass student = new StudentSubClass("Chakitha", "chakkipalavelli@gmail.com", 1);
        student.print();
        student.setStudentID(2);
        student.print();
    }
}
