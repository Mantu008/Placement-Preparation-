import java.util.Stack;

public class Reverse_String_Using_Stack {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("String Before Reverce : " + s);
        String revString = makeRev(s);
        System.out.println("String After Reverce : " + revString);

    }

    public static String makeRev(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            stack.push(ch);
        }

        String revString = "";

        while (!stack.isEmpty()) {
            revString += stack.peek();
            stack.pop();
        }

        return revString;
    }
}
