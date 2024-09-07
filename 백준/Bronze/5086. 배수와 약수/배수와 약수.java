import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        while ((input = br.readLine().split(" ")) != null) {
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);

            if (num1 == 0 && num2 == 0)
                break;

            if (num1 % num2 == 0 && num2 != 0)
                System.out.println("multiple");
            else if (num2 % num1 == 0 && num1 != 0)
                System.out.println("factor");
            else
                System.out.println("neither");
        }
    }
}