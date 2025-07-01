package Object_Oriented_Design_Principles.Object_Modeling.Assisted_Problems;
import java.util.*;

public class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee emp) {
        employees.add(emp);
    }

    void display() {
        System.out.println("  Department: " + deptName);
        for (Employee emp : employees) {
            emp.display();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments;

    Company(String name) {
        this.companyName = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void display() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.display();
        }
    }

    void deleteCompany() {
        departments.clear();
        System.out.println("Company and all departments and employees deleted.");
    }
}
