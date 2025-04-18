import java.util.ArrayList;

public class Prime_numbers_in_a_given_range {
    public static void main(String[] args) {
        int start = 2;
        int end = 10;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            boolean isPrime = checkPrime(i);
            if (isPrime) {
                list.add(i);
            }
        }
        System.out.println("Prime Number In a give Range is : " + list);
    }

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
