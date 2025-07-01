package Java_Constructors.Level_1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private final double costPerDay = 1200.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental("Riya", "Hyundai i20", 3);
        r1.display();
    }
}
