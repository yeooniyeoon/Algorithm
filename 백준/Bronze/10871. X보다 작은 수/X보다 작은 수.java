import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] info = br.readLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int x = Integer.parseInt(info[1]);
        String[] a = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(a[i]) < x)
                bw.write(a[i] + " ");
        }
        bw.flush();
    }
}