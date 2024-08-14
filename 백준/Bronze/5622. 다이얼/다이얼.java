import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        char[] input = sc.next().toCharArray();
        for (char c : input) {
            if (c <= 'C') answer += 3;
            else if (c <= 'F') answer += 4;
            else if (c <= 'I') answer += 5;
            else if (c <= 'L') answer += 6;
            else if (c <= 'O') answer += 7;
            else if (c <= 'S') answer += 8;
            else if (c <= 'V') answer += 9;
            else answer += 10;
        }
        System.out.println(answer);
    }
}