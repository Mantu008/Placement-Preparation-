public class Count_OF_Element_In_Sorted_Array {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 5, 5, 6, 6, 6, 6, 6, 7 };
        int target = 6;
        int fistOccuranceIndex = findFirstOccuranceIndex(arr, target);
        int lastOccuranceIndex = findLastOccuranceIndex(arr, target);
        System.out.println("Fisrst Occurance of " + target + " is " + fistOccuranceIndex + " and Last Occurance of "
                + target + " is " + lastOccuranceIndex);
        System.out.println("Count of the Given Element is :" + (lastOccuranceIndex - fistOccuranceIndex + 1));
    }

    public static int findFirstOccuranceIndex(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start);
            if (target == arr[mid]) {
                res = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    public static int findLastOccuranceIndex(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start);
            if (target == arr[mid]) {
                res = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
