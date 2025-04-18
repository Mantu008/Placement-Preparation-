import java.util.Stack;

public class Stack_Span_Problem {

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        int ssp[] = new int[arr.length];
        findSsp(arr, ssp);
        for (int val : ssp) {
            System.out.print(val + " ");
        }
    }

    public static void findSsp(int arr[], int ssp[]) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ssp[i] = i - st.peek();
            } else {
                ssp[i] = 1;
            }

            st.push(i);
        }
    }

}