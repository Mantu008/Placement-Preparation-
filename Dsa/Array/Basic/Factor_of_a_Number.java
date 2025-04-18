import java.util.*;

public class Factor_of_a_Number {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean isFactor = checkfactor(n, i);
            if (isFactor) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static boolean checkfactor(int n, int i) {
        return n % i == 0;
    }
}
