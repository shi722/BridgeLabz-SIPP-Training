import java.util.*;
 class Ticket {
    String type;       
    String customerName;
    public Ticket(String type, String customerName) {
        this.type = type;
        this.customerName = customerName;
    }
}

public class CallCenterQueue {
    public static void main(String[] args) {
        Queue<Ticket> queue = new LinkedList<>();
        queue.add(new Ticket("Call", "Shivanshu"));
        queue.add(new Ticket("Email", "Kartikey"));
        queue.add(new Ticket("Chat", "Ankit"));
        while(!queue.isEmpty()) {
            Ticket t = queue.poll();  
            System.out.println(t.type + " ticket for " + t.customerName);
        }
    }
}