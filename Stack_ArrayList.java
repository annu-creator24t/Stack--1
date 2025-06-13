import java.util.ArrayList;

public class Stack_ArrayList {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // Check if the stack is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push 
        public static void push(int data) {
            list.add(data);
        }

        // Pop 
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek 
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);

        System.out.println("Top element: " + Stack.peek());

        System.out.println("Popped element: " + Stack.pop());
        System.out.println("Popped element: " + Stack.pop());
        System.out.println("Popped element: " + Stack.pop());

        System.out.println("Is stack empty? " + Stack.isEmpty());
    }
}
