package Encapsulation_Polymorphism_Interface_AbstractClass;

abstract class Product {
    protected String productId;
    protected String name;
    protected double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return 0.1 * price;
    }

    public double calculateTax() {
        return 0.18 * price;
    }

    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return 0.15 * price;
    }

    public double calculateTax() {
        return 0.05 * price;
    }

    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return 0.02 * price;
    }
}

class ECommercePlatform {
    public static void calculateFinalPrice(Product p) {
        double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
        double discount = p.calculateDiscount();
        double finalPrice = p.price + tax - discount;
        System.out.println(p.name + " Final Price: ₹" + finalPrice);
    }
}
