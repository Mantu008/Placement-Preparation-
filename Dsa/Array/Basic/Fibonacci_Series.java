public class Fibonacci_Series {
    public static void main(String[] args) {
        int nthTerm = 6;
        printFibonacciByLoop(nthTerm);
        printFibonacciByRecursion(nthTerm);
    }

    public static void printFibonacciByLoop(int nthTerm) {
        // initally
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series up to " + nthTerm + " terms By Loop: ");
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < nthTerm; i++) {
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.print(nextTerm + " ");
        }
        System.out.println();
    }

    public static void printFibonacciByRecursion(int nthTerm) {
        System.out.print("Fibonacci Series up to " + nthTerm + " terms By Recursion: ");
        for (int i = 0; i < nthTerm; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
