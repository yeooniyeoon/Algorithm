import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        if (n < 3)
            System.out.println(0);
        else
            System.out.println(((long) n * (n - 1) * (n - 2)) / 6);
        
        System.out.println(3);
    }
}