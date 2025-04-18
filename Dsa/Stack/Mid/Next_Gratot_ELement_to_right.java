import java.util.Stack;

public class Next_Gratot_ELement_to_right {
    public static void main(String[] args) {
        int arr[] = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
        int nge[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        findNge(arr, nge, stack);

        for (Integer integer : nge) {
            System.out.print(integer + " ");

        }
    }

    public static void findNge(int arr[], int nge[], Stack<Integer> stack) {
        int n = arr.length;
        stack.push(arr[n - 1]);
        nge[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                nge[i] = stack.peek();
            } else {
                nge[i] = -1;
            }

            stack.push(arr[i]);
        }

    }
}
