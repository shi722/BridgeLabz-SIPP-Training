package Inheritance;

public interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Duties: Preparing meals and managing the kitchen.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        displayInfo();
        System.out.println("Role: Waiter");
        System.out.println("Duties: Serving food and attending customers.");
    }
}

class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Aman", 101);
        Waiter waiter = new Waiter("Ravi", 202);

        System.out.println("--- Chef Info ---");
        chef.performDuties();

        System.out.println("\n--- Waiter Info ---");
        waiter.performDuties();
    }
}
