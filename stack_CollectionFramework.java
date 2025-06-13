import java.util.Stack;

public class stack_CollectionFramework {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push 
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek 
        System.out.println("Top element: " + stack.peek()); // 30

        // Pop and print 
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
