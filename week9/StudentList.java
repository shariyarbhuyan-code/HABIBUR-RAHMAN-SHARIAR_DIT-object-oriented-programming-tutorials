package week9;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Shariar");
        students.add("Tuhin");
        students.add("Zihad");

        System.out.println("Student List:");
        for (String student : students) {
            System.out.println("- " + student);
        }
    }
}
