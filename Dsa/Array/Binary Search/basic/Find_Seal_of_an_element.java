public class Find_Seal_of_an_element {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 8, 11, 17, 38 };
        int target = 6;
        int floar = findSeal(arr, target);
        System.out.println("The Seal OF the given target at Index :" + floar);
    }

    public static int findSeal(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}