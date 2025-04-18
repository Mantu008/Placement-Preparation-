public class Search_In_Unsorted_TD_Matrix {

    public static void main(String[] args) {
        // Input: matrix = [[1, 4, 7], [8, 10, 15], [17, 20, 25]], target = 10
        // Output: Found at (1,1)

        int arr[][] = { { 1, 4, 7 }, { 8, 10, 15 }, { 17, 20, 25 } };
        int target = 10;
        int foundIt[] = foundItInTdMatrix(arr, target);
        System.out.println("[" + foundIt[0] + "," + foundIt[1] + "]");

    }

    public static int[] foundItInTdMatrix(int arr[][], int target) {
        int[] ans = { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}