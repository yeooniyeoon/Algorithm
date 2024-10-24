import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int[] numsSort = nums.clone();
        Arrays.sort(numsSort);

        int rank = 0;

        for(int value : numsSort) {
            if (!map.containsKey(value)) {
                map.put(value, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int value : nums)
            sb.append(map.get(value)).append(' ');

        System.out.println(sb);
    }
}