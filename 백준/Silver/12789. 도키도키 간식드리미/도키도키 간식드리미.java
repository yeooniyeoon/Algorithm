import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int point = 1;

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (input == point)
                point++;
            else
                stack.push(input);

            while (!stack.isEmpty() && stack.peek() == point) {
                stack.pop();
                point++;
            }
        }

        if (stack.isEmpty())
            System.out.println("Nice");
        else
            System.out.println("Sad");
    }
}