import java.io.*;

public class Main {
    // true이면 분자 증가, false면 분모 증가
    private static boolean status = true;
    private static int numerator = 1, denominator = 2;
    private static int count = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(1 + "/" + 1);
        }
        else {
            while (count < n)
                fluctuation();

            System.out.println(numerator + "/" + denominator);
        }
    }

    public static void fluctuation() {
        if (numerator == 1 && status == false) {
            status = !status;
            denominator++;
        }
        else if (denominator == 1 && status == true) {
            status = !status;
            numerator++;
        }
        else if (status) { numerator++; denominator--; }
        else if (!status) { numerator--; denominator++; }
        count++;
    }
}