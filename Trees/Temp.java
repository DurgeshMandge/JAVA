import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Temp
 */
public class Temp {
    public static List<Integer> getMax(List<String> operations) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        for (String operation : operations) {
            if (operation.charAt(0) == '1') {
                int value = Integer.parseInt(operation.substring(2));
                stack.push(value);
                if (maxStack.isEmpty() || value >= maxStack.peek()) {
                    maxStack.push(value);
                }
            } else if (operation.charAt(0) == '2') {
                int poppedValue = stack.pop();
                if (poppedValue == maxStack.peek()) {
                    maxStack.pop();
                }
            } else if (operation.charAt(0) == '3') {
                result.add(maxStack.peek());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> operations = new ArrayList<>();
        operations.add("1 34");
        operations.add("3");
        operations.add("1 37");
        operations.add("2");
        operations.add("3");
        System.out.println(getMax(operations));
    }
}