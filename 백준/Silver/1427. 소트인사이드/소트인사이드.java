import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");

        int[] nums = new int[input.length];
        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(input[i]);

        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--)
            System.out.print(nums[i]);
    }
}