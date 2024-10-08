import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int largest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));
        int middle = a + b + c - largest - smallest;

        if (largest >= middle + smallest)
            largest = middle + smallest - 1;

        System.out.println(largest + middle + smallest);
    }
}