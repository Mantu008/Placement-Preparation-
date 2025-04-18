public class Peak_Index_In_A_mountainous_Array {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 3, 7, 1, 5, 6 };
        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println("Peak index in the mountain array is: " + peakIndex);
    }

    public static int peakIndexInMountainArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

}
