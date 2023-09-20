package day4;
public class Student {
    private String adminNo;
    private String stuName;
    private String courseJoined;
    private int feesPaid;
    private int JavaFee = 10000; 
    private int PythonFee = 7500; 
    public Student(String adminNo, String stuName) {
        this.adminNo = adminNo;
        this.stuName = stuName;
        this.courseJoined = "Python";
        this.feesPaid = 2000;
    }
    public Student(String adminNo, String stuName, String courseJoined) {
        this(adminNo, stuName); 
        if (courseJoined.equals("Java") || courseJoined.equals("Python")) {
            this.courseJoined = courseJoined;
        } else {
            System.out.println("Invalid course selection");
        }
    }
    public int getTotalFee() {
        if (courseJoined.equals("Java")) {
            return JavaFee;
        } else {
            return PythonFee;
        }
    }
    public int getDue() {
        return getTotalFee() - feesPaid;
    }
    public int getFeePaid() {
        return feesPaid;
    }
    public static void main(String[] args) {
        Student student1 = new Student("1", "Chakitha");
        System.out.println(student1.adminNo);
        System.out.println(student1.stuName);
        System.out.println(student1.courseJoined);
        System.out.println("Total Fee: " + student1.getTotalFee());
        System.out.println("Fees Paid: " + student1.getFeePaid());
        System.out.println("Due Fee: " + student1.getDue());
    }
}
