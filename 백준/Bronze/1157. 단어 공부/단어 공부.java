import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];
        for (char c : br.readLine().toUpperCase().toCharArray())
            count[c - 'A']++;

        int maxIdx = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[maxIdx] <= count[i])
                maxIdx = i;
        }

        boolean duplicate = false;
        for (int i = 0; i < count.length; i++) {
            if (count[maxIdx] == count[i] && maxIdx != i)
                duplicate = true;
        }

        if (duplicate) System.out.println("?");
        else System.out.println((char) (maxIdx + 'A'));
    }
}