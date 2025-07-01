package Object_Oriented_Design_Principles.Object_Modeling.Self_Problems;

import java.util.*;

public class Course {
    String courseName;
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String name) {
        this.courseName = name;
    }

    void enroll(Student student) {
        enrolledStudents.add(student);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course c) {
        courses.add(c);
        c.enroll(this); // Association
    }

    void showCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    List<Student> students;

    School(String name) {
        this.schoolName = name;
        this.students = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            s.showCourses();
        }
    }
}
