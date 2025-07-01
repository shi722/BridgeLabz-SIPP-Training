package Java_Constructors.Access_Modifiers;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String team;

    public Manager(int empID, String department, double salary, String team) {
        super(empID, department, salary);
        this.team = team;
    }

    public void displayManager() {
        System.out.println("Manager ID: " + employeeID + ", Dept: " + department + ", Team: " + team);
    }

    public static void main(String[] args) {
        Manager m = new Manager(1001, "HR", 85000.0, "Recruitment");
        m.displayManager();
        System.out.println("Salary: ₹" + m.getSalary());
        m.setSalary(90000.0);
        System.out.println("Updated Salary: ₹" + m.getSalary());
    }
}
