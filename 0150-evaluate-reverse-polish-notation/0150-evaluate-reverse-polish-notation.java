import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {

                switch (s) {
                    case "+" -> {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a + b);
                    }
                    case "-" -> {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a - b);
                    }
                    case "*" -> {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a * b);
                    }
                    case "/" -> {
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a / b);
                    }
                    default -> stack.push(Integer.parseInt(s));
                }
        }

        return stack.pop();
    }
}