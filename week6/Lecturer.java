package week6;

public class Lecturer extends Employee {
    private String department;

    public Lecturer(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void display() {
        System.out.println("Lecturer: " + name + ", Salary: " + salary + ", Dept: " + department);
    }
}
