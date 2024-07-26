import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while ((input = br.readLine()) != null) {
            String[] inputArr = input.split(" ");
            int num1 = Integer.parseInt(inputArr[0]);
            int num2 = Integer.parseInt(inputArr[1]);
            bw.write(num1 + num2 + "\n");
        }
        bw.flush();
    }
}