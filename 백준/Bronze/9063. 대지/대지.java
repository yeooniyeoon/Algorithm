import java.io.*;

public class Main {
    private static int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 점이 하나만 있는 경우 면적은 0
        if (n == 1) {
            br.readLine();  // 하나의 좌표는 읽어들인다
            System.out.println(0);
            return;
        }

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            // 최솟값과 최댓값 갱신
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        // 넓이 계산 및 출력
        int area = (maxX - minX) * (maxY - minY);
        System.out.println(area);
    }
}