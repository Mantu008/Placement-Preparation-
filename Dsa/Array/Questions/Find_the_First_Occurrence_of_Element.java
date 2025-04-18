public class Find_the_First_Occurrence_of_Element {
    public static void main(String[] args) {
        // Input: arr = [2, 5, 3, 5, 7], target = 5
        // Output: First occurrence at index 1

        int[] arr = { 2, 5, 3, 5, 7 };
        int target = 5;
        int firstOccurance = findFirstoccurance(arr, target);
        System.out.println("First occurance of the given target is: " + firstOccurance);
    }

    public static int findFirstoccurance(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}