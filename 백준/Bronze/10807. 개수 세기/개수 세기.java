import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] intArr = br.readLine().split(" ");
        int findNum = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(intArr[i]) == findNum)
                answer++;
        }
        bw.write(Integer.toString(answer));
        bw.flush();
    }
}