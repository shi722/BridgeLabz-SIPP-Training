package Day3_SortingAlgo;

public class CountingSortAges {
    static void countingSort(int[] arr) {
        int max = 18, min = 10;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[arr.length];

        for (int age : arr)
            count[age - min]++;

        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 12, 14, 11};
        countingSort(ages);
        for (int age : ages)
            System.out.print(age + " ");
    }
}
