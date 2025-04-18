public class Strong_Number {
    public static void main(String[] args) {
        int num = 145;
        findStrongNumberByLoop(num);
        findStrongNumberByRecursion(num);
    }

    // by itteration

    public static void findStrongNumberByLoop(int num) {
        int sum = 0;
        int temp = num;
        int degit;
        while (temp != 0) {
            degit = temp % 10;
            sum = sum + fact(degit);
            temp /= 10;
        }

        if (num == sum) {
            System.out.println(num + " is A strong Number By Loop");
        } else {
            System.out.println(num + " is Not A strong Number By Loop");
        }
    }

    public static int fact(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // by Recursion

    public static void findStrongNumberByRecursion(int num) {
        int sum = 0;
        int temp = num;
        int degit;
        while (temp != 0) {
            degit = temp % 10;
            sum = sum + factRec(degit);
            temp /= 10;
        }

        if (num == sum) {
            System.out.println(num + " is A strong Number BY Recursion");
        } else {
            System.out.println(num + " is Not A strong Number BY Recursion");
        }
    }

    public static int factRec(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factRec(num - 1);
    }
}
