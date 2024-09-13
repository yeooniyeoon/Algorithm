import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] instances = new int[4];

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        instances[0] = x - 0;
        instances[1] = y - 0;
        instances[2] = w - x;
        instances[3] = h - y;

        int min = instances[0];
        for (int distance : instances) {
            if (distance < min)
                min = distance;
        }

        System.out.println(min);
    }
}