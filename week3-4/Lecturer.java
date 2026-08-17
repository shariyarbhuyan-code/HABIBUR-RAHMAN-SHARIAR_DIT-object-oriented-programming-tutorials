package week3_4;

public class Lecturer extends Person {
    private String employeeId;

    public Lecturer(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public void display() {
        System.out.println("Lecturer: " + name + ", Age: " + age + ", ID: " + employeeId);
    }
}
