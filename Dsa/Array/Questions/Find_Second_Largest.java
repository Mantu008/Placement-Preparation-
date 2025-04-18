public class Find_Second_Largest {
    public static void main(String[] args) {
        // Input: arr = [5, 10, 15, 20, 25]
        // Output: Second largest = 20

        int arr[] = { 5, 10, 15, 20, 25 };
        int secondLargest = findSecondlargest(arr);
        System.out.println("the Second Largest Number is: " + secondLargest);
    }

    public static int findSecondlargest(int arr[]) {
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
