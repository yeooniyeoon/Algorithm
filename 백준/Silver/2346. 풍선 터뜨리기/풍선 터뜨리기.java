import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] papers = new int[n];
        for (int i = 0; i < n; i++) {
            papers[i] = scanner.nextInt();
        }

        LinkedList<int[]> balloons = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            balloons.add(new int[]{i + 1, papers[i]}); // {번호, 값}
        }

        StringBuilder result = new StringBuilder();
        int index = 0;

        while (!balloons.isEmpty()) {
            int[] current = balloons.remove(index);
            result.append(current[0]).append(" ");

            if (balloons.isEmpty()) break;

            int move = current[1];
            if (move > 0) {
                index = (index + move - 1) % balloons.size();
            } else {
                index = (index + move) % balloons.size();
                if (index < 0) {
                    index += balloons.size();
                }
            }
        }

        System.out.println(result.toString().trim());
    }
}
