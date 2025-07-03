package Inheritance;

public interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        displayInfo();
        System.out.println("Charging the electric vehicle.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        displayInfo();
        System.out.println("Refueling the petrol vehicle.");
    }
}
class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        System.out.println("--- Electric Vehicle ---");
        ev.charge();

        System.out.println("\n--- Petrol Vehicle ---");
        pv.refuel();
    }
}
