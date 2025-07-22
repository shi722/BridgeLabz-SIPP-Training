package Day4_Linear_and_Binary_Search;

public class PeakElement {
    public static int findPeak(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            boolean leftCheck = mid == 0 || arr[mid] > arr[mid - 1];
            boolean rightCheck = mid == arr.length - 1 || arr[mid] > arr[mid + 1];
            if (leftCheck && rightCheck) return mid;
            else if (!leftCheck) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
}
