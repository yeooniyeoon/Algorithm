import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            sb.append(isValidPS(input) ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }

    public static boolean isValidPS(String ps) {
        Stack<Character> stack = new Stack<>();
        for (char c : ps.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty())
                    return false;
                else
                    stack.pop();
            }
        }

        return stack.isEmpty();
    }
}