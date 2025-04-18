public class Find_the_Last_Occurrence_of_Element {
    public static void main(String[] args) {

        // Input: arr = [2, 5, 3, 5, 7], target = 5
        // Output: Last occurrence at index 3

        int[] arr = { 2, 5, 3, 5, 7 };
        int target = 5;
        int lastOccurance = findLastoccurance(arr, target);
        System.out.println("First occurance of the given target is: " + lastOccurance);
    }

    public static int findLastoccurance(int[] arr, int target) {

        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                idx = i;
            }
        }
        return idx;
    }
}
