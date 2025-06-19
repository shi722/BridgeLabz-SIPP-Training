import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = {"January", "February", "March", "April", "May", "June",
                              "July", "August", "September", "October", "November", "December"};
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getFirstDay(int y, int m) {
        int d = 1;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        return (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(), year = sc.nextInt();
        if (isLeapYear(year)) days[1] = 29;
        int day = getFirstDay(year, month);
        System.out.println("Calendar for " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < day; i++) System.out.print("    ");
        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%3d ", i);
            if ((i + day) % 7 == 0) System.out.println();
        }
    }
}
