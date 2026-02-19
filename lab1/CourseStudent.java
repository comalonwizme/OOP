package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseStudent {
    private String name;
    private String id;
    private double grade;

    public CourseStudent(String name, String id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String toString() {
        return String.format("CourseStudent{name='%s', id='%s', grade=%.2f}", name, id, grade);
    }

    public static ArrayList<CourseStudent> inputStudents(int n) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CourseStudent> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Student name: ");
            String name = sc.next();

            System.out.print("Student id: ");
            String id = sc.next();

            System.out.print("Student grade: ");
            double grade = sc.nextDouble();

            list.add(new CourseStudent(name, id, grade));
            System.out.println();
        }
        return list;
    }
}
