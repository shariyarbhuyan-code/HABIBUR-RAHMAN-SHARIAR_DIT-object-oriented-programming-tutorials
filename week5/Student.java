package week5;

public class Student {
    private String name;
    private int mark;

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public void display() {
        System.out.println("Student: " + name + ", Mark: " + mark);
    }
}
