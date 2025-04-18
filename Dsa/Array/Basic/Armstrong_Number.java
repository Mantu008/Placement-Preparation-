public class Armstrong_Number {
    public static void main(String[] args) {
        int num = 153;
        boolean isArmstrongNumber = checkArmstrongNumber(num);
        System.out.println("Given Number is an Armstrong Number :" + isArmstrongNumber);
    }

    public static boolean checkArmstrongNumber(int num) {
        int temp = num;
        int sum = 0;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp /= 10;
        }
        return sum == num;
    }
}
