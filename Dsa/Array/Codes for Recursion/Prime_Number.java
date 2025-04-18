public class Prime_Number {
    public static void main(String[] args) {
        int num = 5;
        boolean isPrimeNumber = checkPrimeNumber(num, 2);
        System.out.println("This Given Number is Prime Number :" + isPrimeNumber);
    }

    public static boolean checkPrimeNumber(int num, int i) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        if (num == i) {
            return true;
        }

        if (num % i == 0) {
            return false;
        }
        i = i + 1;

        return checkPrimeNumber(num, i);
    }
}
