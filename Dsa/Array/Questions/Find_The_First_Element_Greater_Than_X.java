public class Find_The_First_Element_Greater_Than_X {
    public static void main(String[] args) {
        // Input: arr = [10, 15, 20, 25, 30], X = 18
        // Output: First element greater than X = 20

        int arr[] = { 10, 15, 20, 25, 30 };
        int x = 18;
        int fisrtgratorfind = findFirstGrator(arr, x);
        System.out.println("Find First Grator: " + fisrtgratorfind);
    }

    public static int findFirstGrator(int arr[], int x) {
        int gratorThenX = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                gratorThenX = arr[i];
                break;
            }
        }
        return gratorThenX;
    }
}
