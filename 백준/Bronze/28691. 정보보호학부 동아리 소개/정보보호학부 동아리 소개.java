import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        switch (input) {
            case 'M':
                System.out.println("MatKor");
                break;
            case 'W':
                System.out.println("WiCys");
                break;
            case 'C':
                System.out.println("CyKor");
                break;
            case 'A':
                System.out.println("AlKor");
                break;
            default:
                System.out.println("$clear");
        }
    }
}