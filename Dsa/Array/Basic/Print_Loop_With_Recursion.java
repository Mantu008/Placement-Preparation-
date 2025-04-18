public class Print_Loop_With_Recursion {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    public static void print(int n) {
        if (n == 0) {
            return;
        }

        // System.out.print(n + " "); // for decending order
        print(n - 1);
        System.out.print(n + " "); // for assending order
    }
}
