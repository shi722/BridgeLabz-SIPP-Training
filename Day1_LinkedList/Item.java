package Day1_LinkedList;
public class Item {
    String name;
    int id, qty;
    double price;
    Item next;
    Item(String name, int id, int qty, double price) {
        this.name = name;
        this.id = id;
        this.qty = qty;
        this.price = price;
    }
}
class Inventory {
    Item head;
    void addItem(String name, int id, int qty, double price) {
        Item newItem = new Item(name, id, qty, price);
        newItem.next = head;
        head = newItem;
    }
    void displayItems() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + " | ID: " + temp.id + " | Qty: " + temp.qty + " | ₹" + temp.price);
            temp = temp.next;
        }
    }
    void searchItem(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }
    void removeItem(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next != null) temp.next = temp.next.next;
    }
    void totalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.qty * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItem("Mouse", 1, 10, 300);
        inv.addItem("Keyboard", 2, 5, 500);
        inv.displayItems();
        inv.searchItem(1);
        inv.totalValue();
        inv.removeItem(2);
        System.out.println("After Removal:");
        inv.displayItems();
    }
}
