// Stack Implementation using Array
class Stack {
    int top = -1;
    int size = 0;
    int arr[];

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full, cannot push " + data);
        } else {
            top++;
            arr[top] = data;
            System.out.println("Pushed " + data + " to stack");
        }
    }

    public int pop() {
        if (top >= 0 && top < size) {
            int data = arr[top];
            arr[top] = 0;
            top--;
            System.out.println("Popped " + data + " from stack");
            return data;
        } else {
            System.out.println("Stack is empty, cannot pop");
            return -1;
        }
    }

    public int peak() {
        if (top >= 0 && top < size) {
            System.out.println("Top element is: " + arr[top]);
            return arr[top];
        } else {
            System.out.println("Stack is empty, cannot peak");
            return -1;
        }
    }

    public void size() {
        System.out.println("Size of stack is: " + (top + 1));
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void diaplay() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.peak();
        stack.size();
        stack.diaplay();
        stack.push(3);
        stack.peak();
        stack.size();
        stack.diaplay();
    }
}
