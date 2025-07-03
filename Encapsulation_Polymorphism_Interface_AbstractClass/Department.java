package Encapsulation_Polymorphism_Interface_AbstractClass;

public interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    public String getDepartmentDetails() {
        return department;
    }
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
    }
    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double bonus;
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(101, "Ravi", 30000, 5000);
        Employee emp2 = new PartTimeEmployee(102, "Sita", 200, 80);

        emp1.assignDepartment("HR");
        emp2.assignDepartment("Support");

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Total Salary: " + emp.calculateSalary());
            System.out.println();
        }
    }
}
