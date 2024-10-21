import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0])
                return Integer.compare(a[1], b[1]);
            else
                return Integer.compare(a[0], b[0]);
        });

        for (int i = 0; i < n; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
    }
}