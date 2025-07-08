package Encapsulation_Polymorphism_Interface_AbstractClass;

abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + ": ₹" + price + " x " + quantity);
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    public double applyDiscount() {
        return 0.05 * calculateTotalPrice();
    }

    public String getDiscountDetails() {
        return "5% discount on Veg";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return price * quantity + 30; // Non-veg surcharge
    }

    public double applyDiscount() {
        return 0.02 * calculateTotalPrice();
    }

    public String getDiscountDetails() {
        return "2% discount on Non-Veg";
    }
}
