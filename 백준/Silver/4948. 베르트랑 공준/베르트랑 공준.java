import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 123456 * 2;
        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit ; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int n;

        while ((n = sc.nextInt()) != 0) {
            int count = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i])
                    count++;
            }
            System.out.println(count);
        }
    }
}