import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);
        
        v -= b;
        a -= b;

        if (v % a == 0)
            System.out.println(v / a);
        else
            System.out.println(v / a + 1);
    }
}