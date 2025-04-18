public class Find_the_Sum_of_the_Numbers_in_Range {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = rangeSum(num1, num2);
        System.out.println("RangeSum : " + sum);
    }

    public static int rangeSum(int num1, int num2) {
        // if (num1 > num2) {
        // return 0;
        // }

        if (num1 == num2) {
            return num1; // Base case: If both numbers are equal, return that number
        }

        return num2 + rangeSum(num1, num2 - 1);
    }
}
