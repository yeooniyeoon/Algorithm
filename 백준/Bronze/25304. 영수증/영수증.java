import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int totalCount = sc.nextInt();
        for (int i = 0; i < totalCount; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            sum -= price * quantity;
        }
        if (sum == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}