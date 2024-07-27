import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] buckets = new int[n + 1];
        int m = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            int startIdx = sc.nextInt();
            int endIdx = sc.nextInt();
            int num = sc.nextInt();
            for (int j = startIdx; j <= endIdx; j++) {
                buckets[j] = num;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(buckets[i] + " ");
        }
    }
}