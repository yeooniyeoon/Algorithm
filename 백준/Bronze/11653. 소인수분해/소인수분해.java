import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        if (input == 1)
            return;

        for (int i = 2; i <= input; i++) {
            while (input % i == 0) {
                input /= i;
                System.out.println(i);
            }
        }

        if (input > 1)
            System.out.println(input);
    }
}