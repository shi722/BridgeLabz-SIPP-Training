package Java_Constructors.Instance_vs_Class_Variables_and_Methods;

public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000.0;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle Type: " + vehicleType + ", Registration Fee: ₹" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Riya", "Car");
        Vehicle v2 = new Vehicle("Aman", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
