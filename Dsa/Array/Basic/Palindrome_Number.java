public class Palindrome_Number {
    public static void main(String[] args) {
        int num = 1212;
        boolean isPalindrome = checkPalindrome(num);
        System.out.println("Given Numer is Palindrome Number :" + isPalindrome);
    }

    public static boolean checkPalindrome(int num) {
        int reverceNumber = 0;
        int tempNum = num;
        int rem;
        while (tempNum != 0) {
            rem = tempNum % 10;
            reverceNumber = reverceNumber * 10 + rem;
            tempNum /= 10;
        }

        return num == reverceNumber;
    }
}
