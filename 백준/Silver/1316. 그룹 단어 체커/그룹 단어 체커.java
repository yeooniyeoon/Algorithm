import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            boolean status = true;
            for (int j = 0; j < input.length(); j++) {
                String targetStr = String.valueOf(input.charAt(j));
                input = input.replaceFirst(targetStr, "0");
                if (input.contains(targetStr) &&
                        input.indexOf(targetStr) != j + 1) {
                    status = false;
                    break;
                }
            }
            answer = status ? ++answer : answer;
        }
        System.out.println(answer);
    }
}