public class Find_Largest_Smallest {
    public static void main(String[] args) {
        // Input: arr = [10, 20, 5, 7, 25, 1]
        // Output: Min = 1, Max = 25

        int[] arr = { 10, 20, 5, 7, 25, 1 };
        int minElement = findMinElement(arr);
        int maxElement = findMaxElement(arr);
        System.out.println("Minimum Element is: " + minElement);
        System.out.println("Maximum Element is: " + maxElement);

    }

    public static int findMinElement(int arr[]) {
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minElement) {
                minElement = arr[i];
            }
        }
        return minElement;
    }

    public static int findMaxElement(int arr[]) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
