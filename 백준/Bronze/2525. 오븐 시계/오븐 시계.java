import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cookTime = sc.nextInt();

        minute += cookTime;
        hour += minute / 60;
        minute %= 60;
        hour %= 24;

        System.out.println(hour + " " + minute);
    }
}