import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a == 60 && a == b && b == c)
            System.out.println("Equilateral");
        else if (a + b + c == 180 && (a == b || b == c || a == c))
            System.out.println("Isosceles");
        else if (a + b + c == 180 && a != b && b != c && a != c)
            System.out.println("Scalene");
        else if (a + b + c != 180)
            System.out.println("Error");
    }
}