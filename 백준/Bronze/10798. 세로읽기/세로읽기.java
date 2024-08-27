import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[5];
        StringBuilder answer = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            input[i] = br.readLine();
            if (input[i].length() > maxLength)
                maxLength = input[i].length();
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[j].length() > i)
                    answer.append(input[j].charAt(i));
            }
        }
        System.out.println(answer);
    }
}