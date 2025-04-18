public class Check_Target_In_Array {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        int target = 36;
        boolean targetExist = checkTarget(arr, target);
        System.out.println("Give target is Exist in the given Sorted array: " + targetExist);
    }

    public static boolean checkTarget(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}