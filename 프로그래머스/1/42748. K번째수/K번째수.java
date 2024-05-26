import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<Integer>();

        for (int[] command : commands) {
            int startIdx = command[0] - 1;
            int endIdx = command[1];
            int targetIdx = command[2] - 1;

            int[] subArr = Arrays.copyOfRange(array, startIdx, endIdx);
            Arrays.sort(subArr);

            list.add(subArr[targetIdx]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}