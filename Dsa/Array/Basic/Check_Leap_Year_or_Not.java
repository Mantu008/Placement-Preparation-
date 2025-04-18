public class Check_Leap_Year_or_Not {
    public static void main(String[] args) {
        int year = 2024;
        checkLeepYear(year);
    }

    public static void checkLeepYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " is in Leap Year");
        } else if (year % 4 == 0 && year % 400 != 0) {
            System.out.println(year + " is in Leap Year");
        } else {
            System.out.println(year + " is not in Leap Year");
        }
    }
}
