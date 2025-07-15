import java.util.Scanner;
import java.util.Stack;
public class SimpleBrowser {
    Stack<String> backStack = new Stack<>();
    Stack<String> forwardStack = new Stack<>();
    String currentPage = "home";
    
    void visit(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No back history.");
        }
    }

    void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No forward history.");
        }
    }

    void current() {
        System.out.println("Current Page: " + currentPage);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleBrowser browser = new SimpleBrowser();
        int choice;
        System.out.println("1.Visit | 2.Back | 3.Forward | 4.Current | 0.Exit");

        while (true) {
            System.out.print("\nEnter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.visit(url);
                    break;
                case 2:
                    browser.back();
                    break;
                case 3:
                    browser.forward();
                    break;
                case 4:
                    browser.current();
                    break;
                case 0:
                    System.out.println("Exiting browser.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

