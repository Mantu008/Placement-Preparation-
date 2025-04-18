import java.util.*;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number :");
        num = sc.nextInt();
        checkEvanOdd(num);
    }

    public static void checkEvanOdd(int num) {
        System.out.println("Given Number is :" + (num % 2 == 0 ? "Even" : " Odd"));
    }
}