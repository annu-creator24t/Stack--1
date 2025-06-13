import java.util.Stack;

public class Stack_ReverseString {

    // Method to reverse a string using Stack
    public static String reverse(String input) {
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop all characters from the stack
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            char curr = stack.pop();  // <-- Added here
            reversed.append(curr);
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "AnnuTiwari";
        String result = reverse(str);

        System.out.println("Original String: " + str);       // fixed
        System.out.println("Reversed String: " + result);     // fixed
    }
}
