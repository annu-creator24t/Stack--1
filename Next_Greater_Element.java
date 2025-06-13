import java.util.Stack;

public class Next_Greater_Element {

    public static void printNextGreater(int arr[]) {
        int[] nextGreater = new int[arr.length];
        Stack<Integer> stack = new Stack<>(); 

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];

            while (!stack.isEmpty() && arr[stack.peek()] <= curr) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[stack.peek()];
            }

            stack.push(i); 
        }

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " --> " + nextGreater[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        printNextGreater(arr);
    }
}
