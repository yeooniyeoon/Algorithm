import java.io.*;

public class Main {
    static char[][] board;
    static int minRepaints = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dimensions = br.readLine().split(" ");
        int n = Integer.parseInt(dimensions[0]);
        int m = Integer.parseInt(dimensions[1]);

        board = new char[n][m];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                minRepaints = Math.min(minRepaints, getRepaints(i, j));
            }
        }

        System.out.println(minRepaints);
    }

    public static int getRepaints(int startX, int startY) {
        int repaintWhite = 0; // 기준 색깔이 white인 경우, 칠해야 하는 칸 수
        int repaintBlack = 0; // 기준 색깔이 black인 경우, 칠해야 하는 칸 수

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // 체스판이 패턴에 맞게 칠해졌는지 확인
                if ((i + j) % 2 == 0) { // 기준 색깔이어야 하는 칸
                    if (board[startX + i][startY + j] != 'W') {
                        repaintWhite++;
                    }
                    if (board[startX + i][startY + j] != 'B') {
                        repaintBlack++;
                    }
                }
                else { // 반대 색깔이어야 하는 칸
                    if (board[startX + i][startY + j] != 'B') {
                        repaintWhite++;
                    }
                    if (board[startX + i][startY + j] != 'W') {
                        repaintBlack++;
                    }
                }
            }
        }
        
        // 두 패턴 중 다시 칠해야 하는 칸이 적은 쪽을 반환
        return Math.min(repaintWhite, repaintBlack);
    }
}
