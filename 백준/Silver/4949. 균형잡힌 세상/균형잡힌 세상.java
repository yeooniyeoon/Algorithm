import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;

        while (!(input = br.readLine()).equals("."))
            sb.append(isValidPS(input) ? "yes" : "no").append("\n");

        System.out.println(sb);
    }

    public static boolean isValidPS(String input) {
        char[] chars = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c: chars) {
            if (c == '(' || c == '[')
                stack.push(c);
            else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
            else if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}