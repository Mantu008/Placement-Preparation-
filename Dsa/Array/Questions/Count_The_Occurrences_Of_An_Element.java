public class Count_The_Occurrences_Of_An_Element {
    public static void main(String[] args) {
        // Input: arr = [1, 2, 3, 2, 2, 4, 2], target = 2
        // Output: 4 occurrences

        int[] arr = { 1, 2, 3, 2, 2, 4, 2 };
        int target = 2;
        int countOFOccurance = findCountOfOccurance(arr, target);
        System.out.println("Count the target: " + countOFOccurance);
    }

    public static int findCountOfOccurance(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;

    }
}
