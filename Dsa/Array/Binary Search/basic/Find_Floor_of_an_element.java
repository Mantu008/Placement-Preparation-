public class Find_Floor_of_an_element {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 8, 11, 17, 38 };
        int target = 6;
        int floar = findFloar(arr, target);
        System.out.println("The Floar OF the given target at Index :" + floar);
    }

    public static int findFloar(int arr[], int target) {
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

        return end;
    }
}