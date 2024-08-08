import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int repeat = sc.nextInt();
            char[] ch = sc.next().toCharArray();
            for (char c : ch) {
                for (int j = 0; j < repeat; j++)
                    System.out.print(c);
            }
            System.out.println();
        }
    }
}