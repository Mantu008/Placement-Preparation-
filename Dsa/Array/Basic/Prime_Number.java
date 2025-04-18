public class Prime_Number {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = checkPrimeNumberByLoop(num);
        System.out.println(num + " is a Prime Number : " + isPrime);
        isPrime = checkPrimeNumberByRecursion(num, 2);
        System.out.println(num + " is a Prime Number : " + isPrime);

    }

    // by ittration

    public static boolean checkPrimeNumberByLoop(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // by recursion

    public static boolean checkPrimeNumberByRecursion(int num, int i) {
        if (num < 2) {
            return false;
        }

        if (num == i) {
            return true;
        }

        if (num % i == 0) {
            return false;
        }

        i = i + 1;
        return checkPrimeNumberByRecursion(num, i);
    }

}
