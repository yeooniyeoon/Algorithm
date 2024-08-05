import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++) {
            String[] input = br.readLine().split("");
            bw.write(input[0] + input[input.length - 1] + "\n");
        }
        bw.flush();
    }
}