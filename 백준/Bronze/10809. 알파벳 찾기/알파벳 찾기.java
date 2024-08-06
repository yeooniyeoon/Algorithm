import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        for (char ch = 'a'; ch <= 'z'; ch++)
            bw.write(input.indexOf(ch) + " ");

        bw.flush();
    }
}