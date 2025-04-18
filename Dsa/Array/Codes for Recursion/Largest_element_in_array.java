public class Largest_element_in_array {
    public static void main(String[] args) {
        int arr[] = { 13, 89, 76, 43, 7, 90 };
        int largestElement = findlargestNumber(arr);
        System.out.println("The Largest Number In the Given Array is : " + largestElement);
    }

    public static int findlargestNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
