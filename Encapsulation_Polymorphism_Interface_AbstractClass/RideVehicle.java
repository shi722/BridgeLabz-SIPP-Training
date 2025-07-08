package Encapsulation_Polymorphism_Interface_AbstractClass;

abstract class RideVehicle {
    protected String vehicleId;
    protected String driverName;
    protected double ratePerKm;

    public RideVehicle(String id, String name, double rate) {
        this.vehicleId = id;
        this.driverName = name;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver: " + driverName);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

class RideCar extends RideVehicle implements GPS {
    private String location;

    public RideCar(String id, String name, double rate) {
        super(id, name, rate);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance + 50;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String loc) {
        location = loc;
    }
}

class RideBike extends RideVehicle implements GPS {
    private String location;

    public RideBike(String id, String name, double rate) {
        super(id, name, rate);
    }

    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    public String getCurrentLocation() {
        return location;
    }

    public void updateLocation(String loc) {
        location = loc;
    }
}
