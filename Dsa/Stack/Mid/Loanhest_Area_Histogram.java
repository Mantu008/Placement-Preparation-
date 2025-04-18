import java.util.Stack;

public class Loanhest_Area_Histogram {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
        int lah = findLongestAreaHistogram(arr);
        System.out.println("Longest Area Histogram is : " + lah);
    }

    public static int findLongestAreaHistogram(int arr[]) {
        int nser[] = new int[arr.length];
        int nsel[] = new int[arr.length];
        // find the next smaller element to right
        findNextGratorToRight(arr, nser);
        // find the next smaller element to left
        findNextGratorToRLeft(arr, nsel);

        // calculate the width (nser-nsel)

        int width[] = new int[arr.length];

        for (int i = 0; i < width.length; i++) {
            width[i] = nser[i] - nsel[i] - 1;
        }

        // calculate area for all element histogram
        int area[] = new int[arr.length];
        for (int i = 0; i < area.length; i++) {
            area[i] = width[i] * arr[i];
        }

        // find the gratest among all area histogram

        int lah = Integer.MIN_VALUE;

        for (int i = 0; i < area.length; i++) {
            if (area[i] >= lah) {
                lah = area[i];
            }
        }

        return lah;

    }

    public static void findNextGratorToRight(int arr[], int nger[]) {
        Stack<Integer> st = new Stack<>();
        nger[arr.length - 1] = arr.length;
        st.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                nger[i] = st.peek();
            } else {
                nger[i] = arr.length;
            }

            st.push(i);
        }
    }

    public static void findNextGratorToRLeft(int arr[], int ngel[]) {
        Stack<Integer> st = new Stack<>();
        ngel[0] = -1;
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty()) {
                ngel[i] = st.peek();
            } else {
                ngel[i] = -1;
            }

            st.push(i);
        }
    }
}