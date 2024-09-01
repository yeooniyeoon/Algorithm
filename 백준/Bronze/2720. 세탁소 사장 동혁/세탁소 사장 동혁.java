import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase= Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int input = Integer.parseInt(br.readLine());
            int quarter = 0, dime = 0, nickel = 0, penny = 0;

            quarter = (int) (input / 25);
            input %= 25;

            dime = (int) (input / 10);
            input %= 10;

            nickel = (int) (input / 5);
            input %= 5;

            penny = (int) (input / 1);

            System.out.printf("%d %d %d %d\n", quarter, dime, nickel, penny);
        }
    }
}