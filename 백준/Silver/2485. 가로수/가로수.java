import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            positions.add(sc.nextInt());
        }

        int[] distances = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            distances[i] = positions.get(i + 1) - positions.get(i);
        }

        int gcdValue = distances[0];
        for (int i = 1; i < distances.length; i++) {
            gcdValue = gcd(gcdValue, distances[i]);
        }

        int totalTreeNum = 0;
        for (int distance : distances) {
            totalTreeNum += (distance / gcdValue) - 1;
        }

        System.out.println(totalTreeNum);
    }

    private static int gcd (int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }
}