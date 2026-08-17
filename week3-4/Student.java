package week3_4;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void display() {
        System.out.println("Student: " + name + ", Age: " + age + ", ID: " + studentId);
    }
}
