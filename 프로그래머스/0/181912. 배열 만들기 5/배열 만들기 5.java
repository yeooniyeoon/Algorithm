import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answerList = new ArrayList<>();

        for (String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if (k < num)
                answerList.add(num);
        }

        return answerList.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}