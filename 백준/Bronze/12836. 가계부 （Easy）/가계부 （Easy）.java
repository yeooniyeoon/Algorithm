import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] info = br.readLine().split(" ");
        int days = Integer.parseInt(info[0]);
        int query = Integer.parseInt(info[1]);

        long[] accountBook = new long[days + 1];
        for (int i = 0; i < query; i++) {
            String[] input = br.readLine().split(" ");
            if (input[0].equals("1"))
                accountBook[Integer.parseInt(input[1])] += Long.parseLong(input[2]);

            else if (input[0].equals("2")) {
                long sum = 0;
                for (int j = Integer.parseInt(input[1]); j <= Integer.parseInt(input[2]); j++)
                    sum += accountBook[j];
                bw.write(sum + "\n");
            }
        }
        bw.flush();
    }
}