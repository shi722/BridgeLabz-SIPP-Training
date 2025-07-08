package Encapsulation_Polymorphism_Interface_AbstractClass;

 abstract class Patient {
    protected String patientId;
    protected String name;
    protected int age;

    public Patient(String id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println(name + " (" + age + " yrs)");
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharges = 5000;
    private String record = "";

    public InPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return roomCharges + 2000;
    }

    public void addRecord(String rec) {
        record += rec + "\n";
    }

    public void viewRecords() {
        System.out.println(record);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultFee = 800;
    private String record = "";

    public OutPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return consultFee;
    }

    public void addRecord(String rec) {
        record += rec + "\n";
    }

    public void viewRecords() {
        System.out.println(record);
    }
}

