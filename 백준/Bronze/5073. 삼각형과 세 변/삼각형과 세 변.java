import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = br.readLine().split(" ");

            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if (a == 0 && b == 0 && c == 0)
                break;

            if (!isValidTriangle(a, b, c))
                System.out.println("Invalid");
            else if (a == b && b == c)
                System.out.println("Equilateral");
            else if (a == b || b == c || a == c)
                System.out.println("Isosceles");
            else if (a != b && b != c && a != c)
                System.out.println("Scalene");
        }
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        return a + b + c - max > max;
    }
}