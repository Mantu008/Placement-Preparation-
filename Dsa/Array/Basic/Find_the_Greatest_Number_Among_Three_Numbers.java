public class Find_the_Greatest_Number_Among_Three_Numbers {

    public static void main(String[] args) {
        int num1 = 19;
        int num2 = 10;
        int num3 = 16;
        findGratorByIfElse(num1, num2, num3);
        findGratorByTernery(num1, num2, num3);
    }

    public static void findGratorByIfElse(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is Grator Than " + num2 + " and " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is Grator Than " + num1 + " and " + num3);
        } else {
            System.out.println(num3 + " is Grator Than " + num1 + " and " + num2);

        }
    }

    public static void findGratorByTernery(int num1, int num2, int num3) {
        int fisrstGrator = num1 > num2 ? num1 : num2;
        int finalGrator = fisrstGrator > num3 ? fisrstGrator : num3;

        System.out.println(finalGrator + " is Grator Number");
    }
}