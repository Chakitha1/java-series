package day5;
class Employee {
    protected String name, email;
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
class FactoryEmployee extends Employee {
    protected String busNumber;
    protected boolean isEmployeeOnBoard;   
    public FactoryEmployee(String name, String email, String busNumber, boolean isEmployeeOnBoard) {
        super(name, email);
        this.busNumber = busNumber;
        this.isEmployeeOnBoard = isEmployeeOnBoard;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Employee On Board: " + isEmployeeOnBoard);
    }
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }  
    public void setIsEmployeeOnBoard(boolean isEmployeeOnBoard) {
        this.isEmployeeOnBoard = isEmployeeOnBoard;
    }
}