package Java_Constructors.Instance_vs_Class_Variables_and_Methods;

public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Tech Academy";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: ₹" + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 3000);
        Course c2 = new Course("Web Development", 8, 4000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("CodeHub Institute");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
