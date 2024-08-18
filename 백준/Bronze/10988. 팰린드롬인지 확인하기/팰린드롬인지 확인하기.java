import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder(input);
        if (input.equals(sb.reverse().toString())) System.out.println("1");
        else System.out.println("0");
    }
}