package this_static_final_key_words_and_instanceof_Operator;

public class Product {
    static double discount = 10.0; 
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProduct() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", Price: " + price + ", Quantity: " + quantity);
        }
    }
}
