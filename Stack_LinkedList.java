import java.util.*;

public class Stack_LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null; 

        // Check if the stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // Push 
        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop 
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int popped = head.data;
            head = head.next;
            return popped;
        }

        // Peek 
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);

        System.out.println("Top element: " + Stack.peek());

        System.out.println("Popped: " + Stack.pop());
        System.out.println("Popped: " + Stack.pop());

        System.out.println("Top element: " + Stack.peek());
        System.out.println("Is stack empty? " + Stack.isEmpty());

        System.out.println("Popped: " + Stack.pop());
        System.out.println("Is stack empty? " + Stack.isEmpty());
    }
}
