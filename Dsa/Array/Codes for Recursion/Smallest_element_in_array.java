public class Smallest_element_in_array {
    public static void main(String[] args) {
        int arr[] = { 13, 89, 76, 43, 7, 90 };
        int smallestElemrnt = findSmallestNumber(arr);
        System.out.println("Smallest Element In the given array is : " + smallestElemrnt);

    }

    public static int findSmallestNumber(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }

}
