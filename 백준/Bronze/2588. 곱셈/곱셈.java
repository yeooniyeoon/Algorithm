import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int tmp = num2;
        
        while(tmp > 0) {
            System.out.println(num1 * (tmp % 10));
            tmp /= 10;
        }
        System.out.println(num1 * num2);
    }
}
