import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int lastNum = -1;

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                queue.add(value);
                lastNum = value;
            }
            else if (command.equals("pop")) {
                if (!queue.isEmpty())
                    sb.append(queue.poll()).append("\n");
                else
                    sb.append(-1).append("\n");
            }
            else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            }
            else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? "1\n" : "0\n");
            }
            else if (command.equals("front")) {
                if (!queue.isEmpty())
                    sb.append(queue.peek()).append("\n");
                else
                    sb.append(-1).append("\n");
            }
            else
                if (!queue.isEmpty())
                    sb.append(lastNum).append("\n");
                else
                    sb.append(-1).append("\n");
        }

        System.out.println(sb);
    }
}