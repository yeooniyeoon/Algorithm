import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N번째 종말의 수
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;

        // N번째 종말의 수를 찾을 때까지 반복
        while (true) {
            // 숫자에 '666'이 포함되어 있으면 카운트 증가
            if (String.valueOf(num).contains("666")) {
                count++;
            }

            // N번째 종말의 수를 찾았으면 출력 후 종료
            if (count == N) {
                System.out.println(num);
                break;
            }

            // 다음 숫자 확인
            num++;
        }
    }
}