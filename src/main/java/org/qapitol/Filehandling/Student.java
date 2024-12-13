package org.qapitol.Filehandling;

public class Student extends Person {
    private String course;
    private double marks;

    public Student(int id, String course, double marks, String name, int age) {
        super(id, name, age);
        this.course = course;
        this.marks = marks;
    }

    public static String A = "A-Grade";
    public static String B = "B-Grade";
    public static String C = "C-Grade";

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    void displayInfo() {
        System.out.println("ID: " + + getId() + " Course: " + getCourse()+
                         " Marks: " + getMarks()+ " Name: " + getName() + " Age: " + getAge());

    }

    public void grade() {
        if (marks >= 75) {
            System.out.println(A);
        } else if (marks >= 50) {
            System.out.println(B);
        } else if (marks <= 35) {
            System.out.println(C);
        }
    }
}
