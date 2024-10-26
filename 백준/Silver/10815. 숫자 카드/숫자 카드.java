import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cardArray = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            cardArray[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(cardArray);

        int m = Integer.parseInt(br.readLine());
        int[] queryArray = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++)
            queryArray[i] = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (binarySearch(cardArray, queryArray[i]))
                sb.append(1).append(" ");
            else
                sb.append(0).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static boolean binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == target)
                return true;
            else if (array[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return false;
    }
}