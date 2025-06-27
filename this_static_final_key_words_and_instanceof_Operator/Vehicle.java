package this_static_final_key_words_and_instanceof_Operator;

public class Vehicle {
    static double registrationFee = 500.0;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void showVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg. No: " + registrationNumber);
        }
    }
}
