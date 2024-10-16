import java.io.*;
import java.util.Arrays;

public class Main {
    public static final int NUM_SIZE = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[NUM_SIZE];
        int sum = 0;
        for (int i = 0; i < NUM_SIZE; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        System.out.println(sum / NUM_SIZE);
        System.out.println(arr[NUM_SIZE / 2]);
    }
}