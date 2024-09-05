import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<Integer>();

        for (int[] command : commands) {
            int[] subArr = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(subArr);

            list.add(subArr[command[2] - 1]);
        }

        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}