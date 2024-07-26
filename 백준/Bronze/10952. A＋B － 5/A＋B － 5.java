import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (!input.equals("0 0")) {
                String[] inputArr = input.split(" ");
                bw.write(Integer.parseInt(inputArr[0]) + Integer.parseInt(inputArr[1]) + "\n");
            }
            else break;
        }
        bw.flush();
    }
}