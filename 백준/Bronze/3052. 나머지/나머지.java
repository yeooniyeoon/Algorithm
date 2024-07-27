import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = 42;
        int[] remainderArr = new int [divisor + 1];
        int answer = 0;

        for (int i = 0; i < 10; i++)
            remainderArr[sc.nextInt() % divisor]++;

        for (int i = 0; i < divisor; i++) {
            if (remainderArr[i] != 0)
                answer++;
        }

        System.out.println(answer);
    }
}