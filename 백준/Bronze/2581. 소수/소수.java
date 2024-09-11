import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int sum = 0;
        ArrayList<Integer> primeNums = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
                primeNums.add(i);
            }
        }

        if (primeNums.size() == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(primeNums.get(0));
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}