import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1, range = 2;

        if (n == 1)
            System.out.println(count);

        else {
            while (range <= n)
                range += (6 * count++);
            System.out.println(count);
        }
    }
}