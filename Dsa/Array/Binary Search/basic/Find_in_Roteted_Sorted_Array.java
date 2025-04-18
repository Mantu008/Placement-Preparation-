public class Find_in_Roteted_Sorted_Array {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;
        int elementIdx = findElement(arr, target);
        System.out.println("Find " + target + " at Index of: " + elementIdx);
    }

    public static int findElement(int arr[], int terget) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= arr[0]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int pivit = end;

        start = 0;
        end = arr.length - 1;

        if (arr[pivit] <= terget && terget <= arr[end]) {
            start = pivit;
        } else {
            end = pivit - 1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (terget > arr[mid]) {
                start = mid + 1;
            } else if (terget < arr[mid]) {
                end = mid;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
