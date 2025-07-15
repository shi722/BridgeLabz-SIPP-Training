package Day1_LinkedList;

class Task {
    int id, priority;
    String name, dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {
    Task head = null, tail = null, current = null;

    void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    void addAtPosition(int id, String name, int priority, String dueDate, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        Task temp = head;
        int i = 1;
        while (i < pos - 1 && temp.next != head) {
            temp = temp.next;
            i++;
        }
        Task newTask = new Task(id, name, priority, dueDate);
        newTask.next = temp.next;
        temp.next = newTask;
        if (temp == tail) tail = newTask;
    }

    void removeById(int id) {
        if (head == null) return;
        Task temp = head, prev = tail;

        do {
            if (temp.id == id) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                if (current == temp) current = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentTask() {
        if (current == null) current = head;
        if (current != null) {
            System.out.println("Current Task: " + current.id + ", " + current.name + ", Priority: " + current.priority + ", Due: " + current.dueDate);
        } else {
            System.out.println("No tasks in the scheduler.");
        }
    }

    void moveToNextTask() {
        if (current == null) current = head;
        else current = current.next;
    }

    void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.id + ", Name: " + temp.name + ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int pr) {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == pr) {
                System.out.println("Found: " + temp.id + " " + temp.name + " Priority: " + temp.priority);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No tasks with priority: " + pr);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addAtEnd(1, "Design UI", 2, "2025-07-15");
        ts.addAtEnd(2, "Write Code", 1, "2025-07-16");
        ts.addAtBeginning(3, "Setup Project", 3, "2025-07-14");
        ts.addAtPosition(4, "Testing", 2, "2025-07-17", 2);

        ts.displayAllTasks();
        System.out.println("---");

        ts.viewCurrentTask();
        ts.moveToNextTask();
        ts.viewCurrentTask();
        ts.moveToNextTask();
        ts.viewCurrentTask();

        System.out.println("--- Removing Task ID 2 ---");
        ts.removeById(2);
        ts.displayAllTasks();

        System.out.println("--- Search Priority 2 ---");
        ts.searchByPriority(2);
    }
}
