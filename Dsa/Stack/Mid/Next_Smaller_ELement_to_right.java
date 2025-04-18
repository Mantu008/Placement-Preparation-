import java.util.Stack;

public class Next_Smaller_ELement_to_right {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 2, 7, 4 };
        int nser[] = new int[arr.length];
        findNExtSmallerElementToRight(arr, nser);
        for (int val : nser) {
            System.out.print(val + " ");
        }
    }

    public static void findNExtSmallerElementToRight(int arr[], int nser[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        nser[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                nser[i] = st.peek();
            } else {
                nser[i] = -1;
            }

            st.push(arr[i]);
        }
    }
}
