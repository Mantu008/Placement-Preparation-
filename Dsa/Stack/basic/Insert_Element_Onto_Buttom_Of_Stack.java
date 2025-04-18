
import java.util.Stack;

public class Insert_Element_Onto_Buttom_Of_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);
        int elementToInsert = 5;
        insertAtBottom(stack, elementToInsert);
        System.out.println("Stack after inserting " + elementToInsert + " at the bottom: " + stack);
    }

    // recursive approach

    // public static void insertAtBottom(Stack<Integer> stack, int elementToInsert)
    // {
    // if (stack.isEmpty()) {
    // stack.push(elementToInsert);
    // return;
    // }
    // int topElement = stack.pop(); // Remove the top element
    // insertAtBottom(stack, elementToInsert); // Recursive call to insert at bottom
    // stack.push(topElement); // Push the top element back onto the stack
    // }

    // iterative approach

    public static void insertAtBottom(Stack<Integer> stack, int elementToInsert) {
        if (stack.isEmpty()) {
            stack.push(elementToInsert);
            return;
        }

        int arr[] = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            arr[i] = stack.pop();
            i++;
        }
        stack.push(elementToInsert);
        for (int j = 0; j < arr.length; j++) {
            stack.push(arr[j]);
        }
    }
}
