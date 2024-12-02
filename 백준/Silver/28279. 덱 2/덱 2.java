import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "1":
                    deque.addFirst(Integer.parseInt(command[1]));
                    break;
                case "2":
                    deque.addLast(Integer.parseInt(command[1]));
                    break;
                case "3":
                    if (!deque.isEmpty()) sb.append(deque.removeFirst()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
                case "4":
                    if (!deque.isEmpty()) sb.append(deque.removeLast()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
                case "5":
                    sb.append(deque.size()).append("\n");
                    break;
                case "6":
                    sb.append(deque.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "7":
                    if (!deque.isEmpty()) sb.append(deque.peekFirst()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
                case "8":
                    if (!deque.isEmpty()) sb.append(deque.peekLast()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}