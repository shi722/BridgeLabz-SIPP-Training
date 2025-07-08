package Encapsulation_Polymorphism_Interface_AbstractClass;

abstract class Vehicle {
    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;

    public Vehicle(String number, String type, double rate) {
        this.vehicleNumber = number;
        this.type = type;
        this.rentalRate = rate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) {
        super(num, "Car", rate);
    }

    public double calculateRentalCost(int days) {
        return days * rentalRate;
    }

    public double calculateInsurance() {
        return 1000;
    }

    public String getInsuranceDetails() {
        return "Car insurance ₹1000";
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) {
        super(num, "Bike", rate);
    }

    public double calculateRentalCost(int days) {
        return days * rentalRate;
    }

    public double calculateInsurance() {
        return 500;
    }

    public String getInsuranceDetails() {
        return "Bike insurance ₹500";
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) {
        super(num, "Truck", rate);
    }

    public double calculateRentalCost(int days) {
        return days * rentalRate + 2000;
    }

    public double calculateInsurance() {
        return 2000;
    }

    public String getInsuranceDetails() {
        return "Truck insurance ₹2000";
    }
}
