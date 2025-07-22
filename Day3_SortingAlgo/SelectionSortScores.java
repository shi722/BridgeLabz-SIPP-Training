package Day3_SortingAlgo;

public class SelectionSortScores {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            int t = arr[minIdx]; arr[minIdx] = arr[i]; arr[i] = t;
        }
    }
    public static void main(String[] args) {
        int[] scores = {88, 75, 96, 64, 55};
        selectionSort(scores);
        for (int score : scores)
            System.out.print(score + " ");
    }
}
