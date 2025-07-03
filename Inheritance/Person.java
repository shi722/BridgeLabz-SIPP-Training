package Inheritance;
public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

 class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Rahul", 16, "10th Grade");
        Staff st = new Staff("Mrs. Verma", 35, "Administration");

        System.out.println("---- Teacher Info ----");
        t.displayRole();

        System.out.println("\n---- Student Info ----");
        s.displayRole();

        System.out.println("\n---- Staff Info ----");
        st.displayRole();
    }
}

