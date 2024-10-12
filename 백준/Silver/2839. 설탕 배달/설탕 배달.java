import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int bagCount = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                bagCount += n / 5;
                n = 0;
                break;
            }
            n -= 3;
            bagCount++;
        }

        if (n < 0)
            System.out.println(-1);
        else
            System.out.println(bagCount);
    }
}