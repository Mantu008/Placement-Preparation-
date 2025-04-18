public class Find_Pivit_in_Array {

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
        int pivit = findPivit(arr);
        System.out.println("The Pivit Element is :" + pivit);
    }

    public static int findPivit(int arr[]) {
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
        return arr[start];
    }
}