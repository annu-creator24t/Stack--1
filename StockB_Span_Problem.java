import java.util.Stack;

public class StockB_Span_Problem {

    public static void calculateSpan(int stocks[], int span[]) {
        Stack<Integer> stack = new Stack<>();

        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];

            while (!stack.isEmpty() && currPrice >= stocks[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }
    }

    public static void printSpan(int span[]) {
        for (int s : span) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 75, 85};
        int span[] = new int[stocks.length];

        calculateSpan(stocks, span);

        System.out.println("Stock Span values:");
        printSpan(span);
    }
}
