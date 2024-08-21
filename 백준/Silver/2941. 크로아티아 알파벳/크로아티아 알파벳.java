import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int answer = 0;

        for (int i = 0; i < input.length; i++) {
            answer++;
            if (i < input.length - 1) {
                if (input[i] == 'c' && (input[i + 1] == '=' || input[i + 1] == '-'))
                    i++;
                else if (i < input.length - 2 && input[i] == 'd' && input[i + 1] == 'z' && input[i + 2] == '=')
                    i+=2;
                else if (input[i] == 'd' && input[i + 1] == '-')
                    i++;
                else if (input[i] == 'l' && input[i + 1] == 'j')
                    i++;
                else if (input[i] == 'n' && input[i + 1] == 'j')
                    i++;
                else if (input[i] == 's' && input[i + 1] == '=')
                    i++;
                else if (input[i] == 'z' && input[i + 1] == '=')
                    i++;
            }
        }
        System.out.println(answer);
    }
}