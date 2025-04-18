import java.util.*;

public class Number_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter The Number :");
        num = sc.nextInt();
        checkNumber(num);
    }

    public static void checkNumber(int num) {
        if (num == 0) {
            System.out.println("Given Number is Equal to Zero");
        } else if (num > 0) {
            System.out.println("Given Number is Positive");
        } else {
            System.out.println("Given Number is Negative");
        }
    }
}