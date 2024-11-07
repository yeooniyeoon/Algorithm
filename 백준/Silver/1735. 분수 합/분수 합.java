import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();

        int ansDen = lcm(den1, den2);
        num1 *= ansDen / den1;
        num2 *= ansDen / den2;
        int ansNum = num1 + num2;
        
        int gcd = gcd(ansNum, ansDen);
        ansNum /= gcd;
        ansDen /= gcd;

        System.out.println(ansNum + " " + ansDen);
    }

    private static int lcm (int a, int b) {
        return a * b / gcd(a, b);
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