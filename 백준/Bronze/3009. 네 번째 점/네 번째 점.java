import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int [3];
        int[] y = new int [3];

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            x[i] = Integer.parseInt(input[0]);
            y[i] = Integer.parseInt(input[1]);
        }

        int answerX = x[0] == x[1] ? x[2] : (x[0] == x[2] ? x[1] : x[0]);
        int answerY = y[0] == y[1] ? y[2] : (y[0] == y[2] ? y[1] : y[0]);

        System.out.println(answerX + " " + answerY);
    }
}