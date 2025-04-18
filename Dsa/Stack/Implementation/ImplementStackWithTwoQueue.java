import java.util.LinkedList;
import java.util.Queue;

class Stack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
        System.out.println(x + " is Push Sucessfully on the top of the stack");
    }

    public void pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int topVal = q1.poll();
        System.out.println(topVal + " is pop from stack");
    }

    public void peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(q1.peek() + " is Top Element from stack");
    }

    public void print() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Current Stack: ");
        for (int val : q1) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

public class ImplementStackWithTwoQueue {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.print();
        st.push(5);
        st.peek();
        st.pop();
    }
}
