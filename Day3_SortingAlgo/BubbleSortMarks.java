package Day3_SortingAlgo;

 public class BubbleSortMarks {
    public static void main(String[] args) {
        int[] marks = {45, 78, 23, 89, 12, 67, 90, 34};
        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
