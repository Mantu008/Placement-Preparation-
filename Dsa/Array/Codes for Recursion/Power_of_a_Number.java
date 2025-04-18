public class Power_of_a_Number {
    public static void main(String[] args) {
        int base = 3;
        int power = 3;
        int powNumber = findPower(base, power);
        System.out.println("Power Of " + base + "^" + power + " is : " + powNumber);
    }

    public static int findPower(int base, int power) {
        if (power == 0) {
            return 1;
        }

        return base * findPower(base, power - 1);
    }
}
