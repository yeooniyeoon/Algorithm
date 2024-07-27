import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();

        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = i;

        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }

        for (int i = 1; i <= n; i++)
            System.out.print(arr[i] + " ");
    }
}