import java.util.Stack;

public class Next_Gratot_ELement_to_left {
    public static void main(String[] args) {
        int arr[] = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
        int ngl[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        findNgl(arr, ngl, stack);

        for (Integer integer : ngl) {
            System.out.print(integer + " ");

        }
    }

    public static void findNgl(int arr[], int ngl[], Stack<Integer> stack) {
        ngl[0] = -1;
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                ngl[i] = stack.peek();
            } else {
                ngl[i] = -1;
            }

            stack.push(arr[i]);
        }

    }
}
