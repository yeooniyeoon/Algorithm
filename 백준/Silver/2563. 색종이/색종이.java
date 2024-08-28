import java.io.*;

class Point {
    int x;
    int y;
}

public class Main{
    private static final int GRID_SIZE = 100; // 도화지 크기 100x100
    private static boolean[][] grid = new boolean[GRID_SIZE][GRID_SIZE];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numPapers = Integer.parseInt(br.readLine());

        // 색종이를 도화지에 붙이기
        for (int i = 0; i < numPapers; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            markGrid(x, y);
        }

        // 검은색 영역의 넓이 계산
        int blackArea = calculateBlackArea();
        System.out.println(blackArea);
    }

    // 색종이가 붙은 부분을 true로 마킹
    private static void markGrid(int x, int y) {
        for (int i = x; i < x + 10; i++) {
            for (int j = y; j < y + 10; j++) {
                grid[i][j] = true;
            }
        }
    }

    // 검은색 영역의 넓이를 계산
    private static int calculateBlackArea() {
        int area = 0;
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (grid[i][j]) {
                    area++;
                }
            }
        }
        return area;
    }
}