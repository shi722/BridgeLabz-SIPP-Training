package this_static_final_key_words_and_instanceof_Operator;

public class Employee {
    static String companyName = "Infosys";
    static int totalEmployees = 0;

    final int id;
    String name, designation;

    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void showDetails() {
        if (this instanceof Employee) {
            System.out.println("ID: " + id + ", Name: " + name + ", Role: " + designation);
        }
    }
}

