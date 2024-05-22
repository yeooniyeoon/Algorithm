import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                queue.offer(arr[i]);
            }
        }

        int[] result = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            result[i++] = queue.poll();
        }

        return result;
    }
}