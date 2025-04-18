import java.util.ArrayList;

public class Armstrong_Numbers_In_9Ranges {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int startRange = 10;
        int endRange = 1000;

        for (int i = startRange; i <= endRange; i++) {
            boolean isArmstrongNumber = checkArmstrongNumber(i);
            if (isArmstrongNumber) {
                list.add(i);
            }
        }
        System.out.println("Armstrong Numbers Between Range : " + list);
    }

    public static boolean checkArmstrongNumber(int num) {
        int temp = num;
        int rem;
        int sum = 0;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp /= 10;
        }
        return sum == num;
    }
}
