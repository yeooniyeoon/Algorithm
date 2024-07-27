import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subNum = sc.nextInt();
        int a[] = new int[subNum];
        long sum = 0;
        long max = 0;
        for (int i = 0; i < subNum; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(sum * 100.0 / max / subNum);
    }
}
