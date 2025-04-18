public class Factorial_of_a_Number {
    public static void main(String[] args) {
        int n = 5;
        findFactorialByLoop(n); // n! = 5! == 1*2*3*4*5= 120
        findFactorialByRecursion(n);
    }

    public static void findFactorialByLoop(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of a Number By Loop : " + fact);
    }

    public static void findFactorialByRecursion(int n) {
        int fact = findFact(n);
        System.out.println("Factorial of a Number By Recursion : " + fact);
    }

    public static int findFact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * findFact(n - 1);
    }

}