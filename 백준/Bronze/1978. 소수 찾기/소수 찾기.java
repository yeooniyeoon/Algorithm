import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            if (isPrimeNumber(num))
                count++;
        }

        System.out.println(count);
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