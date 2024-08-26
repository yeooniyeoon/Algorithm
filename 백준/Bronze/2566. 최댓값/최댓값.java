import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0, y = 0, max = 0;

        for (int i = 0; i < 9; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                if (max < Integer.parseInt(input[j])) {
                    max = Integer.parseInt(input[j]);
                    x = i; y = j;
                }
            }
        }
        System.out.println(max + "\n" + ++x + " " + ++y);
    }
}