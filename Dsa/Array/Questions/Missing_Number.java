public class Missing_Number {
    public static void main(String[] args) {
        // Input: arr = [1, 2, 3, 5, 6]
        // Output: Missing number = 4
        int arr[] = { 1, 2, 3, 5, 6 };
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing Number is: " + missingNumber);
    }

    public static int findMissingNumber(int arr[]) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return total - sum;
    }

}
