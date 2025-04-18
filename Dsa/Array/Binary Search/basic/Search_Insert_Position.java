
public class Search_Insert_Position {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int target = 2;
        int insertPos = searchInsert(arr, target);
        System.out.println("Insert At position: " + insertPos);
    }

    public static int searchInsert(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; // Found target, return index
            } else if (target > arr[mid]) {
                start = mid + 1; // Search right
            } else {
                end = mid - 1; // Search left
            }
        }
        return start; // Insert position when not found
    }
}
