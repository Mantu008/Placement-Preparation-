import java.util.Stack;

class Queue {
    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();

    public void push(int x) {
        st1.push(x);
    }

    public void pop() {
        if (st1.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        int topVal = st2.pop();
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        System.out.println(topVal + " is Poped from queue");
    }

    public void peek() {
        if (st1.isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        int topVal = st2.peek();
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        System.out.println(topVal + " is the top Element from queue");
    }

    public void print() {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        while (!st2.isEmpty()) {
            System.out.print(st2.peek() + " ");
            st1.push(st2.pop());
        }
        System.out.println();
    }
}

public class ImplementQueueWithTwoStack {
    public static void main(String[] args) {
        Queue que = new Queue();
        que.push(1);
        que.push(2);
        que.push(3);
        que.print();
        que.peek();
        que.pop();
        que.print();

    }
}
