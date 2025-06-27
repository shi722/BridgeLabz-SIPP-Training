package this_static_final_key_words_and_instanceof_Operator;

public class Student {
    static String universityName = "Delhi University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void showDetails() {
        if (this instanceof Student) {
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
        }
    }
}
