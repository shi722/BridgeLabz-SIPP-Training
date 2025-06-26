public class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Unit Price: ₹" + price);
    }

    void calculateTotalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost for " + quantity + " units: ₹" + total);
    }

    public static void main(String[] args) {
        Item item = new Item(501, "Keyboard", 799.50);
        item.displayDetails();
        item.calculateTotalCost(3);
    }
}
