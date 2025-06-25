package Day5_String;

import java.util.*;

public class RockPaperScissorsGame {

    public static String getComputerChoice() {
        int n = (int)(Math.random() * 3);
        return (n == 0) ? "rock" : (n == 1) ? "paper" : "scissors";
    }

    public static String getWinner(String player, String comp) {
        if (player.equals(comp)) return "Draw";
        if ((player.equals("rock") && comp.equals("scissors")) ||
            (player.equals("paper") && comp.equals("rock")) ||
            (player.equals("scissors") && comp.equals("paper"))) return "Player";
        return "Computer";
    }

    public static void displayStats(List<String[]> history) {
        int pWins = 0, cWins = 0;
        System.out.println("Game\tPlayer\tComputer\tWinner");
        for (int i = 0; i < history.size(); i++) {
            String[] h = history.get(i);
            System.out.printf("%d\t%s\t%s\t\t%s\n", i + 1, h[0], h[1], h[2]);
            if (h[2].equals("Player")) pWins++;
            else if (h[2].equals("Computer")) cWins++;
        }
        int total = history.size();
        System.out.printf("Player Win%%: %.2f%%\n", (pWins * 100.0) / total);
        System.out.printf("Computer Win%%: %.2f%%\n", (cWins * 100.0) / total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> history = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String player = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(player, comp);
            history.add(new String[]{player, comp, winner});
        }
        displayStats(history);
    }
}
