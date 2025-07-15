package Day3_SortingAlgo;

 public class InsertionSortEmployeeIDs {
    public static void insertionSort(int[] ids) {
        for (int i = 1; i < ids.length; i++) {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 110, 101, 108};

        insertionSort(employeeIDs);

        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}
