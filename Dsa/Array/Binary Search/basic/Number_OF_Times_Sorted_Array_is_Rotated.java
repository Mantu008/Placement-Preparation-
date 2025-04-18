public class Number_OF_Times_Sorted_Array_is_Rotated {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
        int n = arr.length;
        System.out.println("Number of times the sorted array is rotated is : " + countRotations(arr, n));
    }

    public static int countRotations(int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
