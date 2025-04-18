import java.util.*;

public class Sum_Of_N_Natural_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number :");
        num = sc.nextInt();
        int sum = findSum(num);
        System.out.print("Sum of N Natural Number is :" + sum);
    }

    // by loop

    // public static void findSum(int num) {
    // int sum = 0;
    // for (int i = 1; i <= num; i++) {
    // sum += i;
    // }
    // System.out.print("Sum of N Natural Number is :" + sum);
    // }

    // by formulla

    public static int findSum(int num) {
        if (num == 0) {
            return num;
        }
        return num + findSum(num - 1);
    }

}